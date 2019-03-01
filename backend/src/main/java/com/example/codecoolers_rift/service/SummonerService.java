package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.*;
import com.example.codecoolers_rift.repository.ChampionMasteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@Service
@CrossOrigin
public class SummonerService {

    @Autowired
    private SummonerRequest summonerRequest;
    @Autowired
    private ChampionMasteryRepository championMasteryRepository;
    private ChampionMastery championMastery;
    private SummonerInfo summonerInfo;
    private Summoner summoner;
    @Autowired
    private MatchHistoryService matchHistoryService;

    public Summoner getSummoner(String region, String name){

        if (championMasteryRepository.existsAllByChampionIdIsNotNull()) {
            System.out.println("Already exist");
        }

        summonerInfo = summonerRequest.callRestAPI(region, name);
        LeagueRank[] leagueRank = summonerRequest.callRankRestAPI(region, summonerInfo.getId());
        ChampionMastery[] championMasteries = summonerRequest.callCMRestApi(region, summonerInfo.getId());
        fillSummonerData();
        fillRankData(summoner, leagueRank);
        fillMasteryData(summoner, championMasteries);
        summoner.setMatchids(summonerRequest.callMatchHistory(region, summonerInfo.getAccountId()).getMatchids());
        summoner.setLastGameInfo(matchHistoryService.fillLastGameInfo(region, summoner.getMatchids().get(0)));
        return summoner;
    }

    public void saveToDatabase(ChampionMastery[] championMasteries) {
        for (ChampionMastery championMastery: championMasteries) {
            ChampionMastery champMastery = ChampionMastery.builder()
                    .championId(championMastery.getChampionId())
                    .championPoints(championMastery.getChampionPoints())
                    .championLevel(championMastery.getChampionLevel())
                    .summonerId(championMastery.getSummonerId())
                    .build();

            championMasteryRepository.save(champMastery);
        }


    }

    public void searchFromDatabase() {

    }


    private void fillSummonerData(){
        summoner = new Summoner();
        summoner.setName(summonerInfo.getName());
        summoner.setProfileIconId(summonerInfo.getProfileIconId());
        summoner.setSummonerLevel(summonerInfo.getSummonerLevel());
        summoner.setId(summonerInfo.getId());
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
