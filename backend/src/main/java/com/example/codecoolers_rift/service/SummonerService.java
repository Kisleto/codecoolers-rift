package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.ChampionMastery;
import com.example.codecoolers_rift.model.LeagueRank;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.model.SummonerInfo;
import com.example.codecoolers_rift.repository.ChampionMasteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


@Service
@CrossOrigin // not needed!
public class SummonerService {

    @Autowired
    private SummonerRequest summonerRequest;
    @Autowired
    private ChampionMasteryRepository championMasteryRepository;
    @Autowired
    private MatchHistoryService matchHistoryService;

    public Summoner getSummoner(String region, String name){

        if (championMasteryRepository.existsAllByChampionIdIsNotNull()) {
            System.out.println("Already exist");
        }

        SummonerInfo summonerInfo = summonerRequest.callRestAPI(region, name);
        LeagueRank[] leagueRank = summonerRequest.callRankRestAPI(region, summonerInfo.getId());
        ChampionMastery[] championMasteries = summonerRequest.callCMRestApi(region, summonerInfo.getId());
        Summoner summoner = fillSummonerData(summonerInfo);
        fillRankData(summoner, leagueRank);
        fillMasteryData(summoner, championMasteries);
        summoner.setMatchids(summonerRequest.callMatchHistory(region, summonerInfo.getAccountId()).getMatchids());
        summoner.setLastGameInfo(matchHistoryService.fillLastGameInfo(region, summoner.getMatchids().get(0)));
        return summoner;
    }

    private Summoner fillSummonerData(SummonerInfo summonerInfo){
        Summoner summoner = new Summoner();
        summoner.setName(summonerInfo.getName());
        summoner.setProfileIconId(summonerInfo.getProfileIconId());
        summoner.setSummonerLevel(summonerInfo.getSummonerLevel());
        summoner.setId(summonerInfo.getId());
        return summoner;
    }

    private void fillRankData(Summoner summoner, LeagueRank[] leagueRanks){
        summoner.setSummonerRank(summoner.addtoLeaguerank(leagueRanks));
    }

    private void fillMasteryData(Summoner summoner, ChampionMastery[] championMasteries){
        for (int i=0; i <3; i++){
            summoner.addtoMasteryRank(championMasteries[i]);
        }
    }

}
