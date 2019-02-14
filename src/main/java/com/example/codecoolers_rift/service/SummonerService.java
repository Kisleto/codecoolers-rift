package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.LeagueRank;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummonerService {

    @Autowired
    private SummonerRequest summonerRequest;
    private SummonerInfo summonerInfo;
    private Summoner summoner;
    private LeagueRank[] leagueRank;

    public Summoner getSummoner(String region, String name){
        summonerInfo = summonerRequest.callRestAPI(region, name);
        leagueRank = summonerRequest.callRankRestAPI(region,summonerInfo.getId());
        fillSummonerData();
        fillRankData(summoner, leagueRank);
        return summoner;
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

}
