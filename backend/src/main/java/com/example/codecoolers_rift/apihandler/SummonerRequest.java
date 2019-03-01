package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.*;
import com.example.codecoolers_rift.model.gameidentity.GameData;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
@CrossOrigin
public class SummonerRequest {

  

    private static String key = "RGAPI-38caf7a3-d729-4b00-8d11-3e0eaf9516dd";



    public SummonerInfo callRestAPI(String region, String name){
        String url = "https://"+region+".api.riotgames.com/lol/summoner/v4/summoners/by-name/"+name+"?api_key="+key;
        RestTemplate restTemplate = new RestTemplate();
        SummonerInfo summonerInfo = restTemplate
                .getForObject(url, SummonerInfo.class);
        return summonerInfo;

    }

    public LeagueRank[] callRankRestAPI(String region,String id){
        String url = "https://"+region+".api.riotgames.com/lol/league/v4/positions/by-summoner/"+id+"?api_key="+key;
        RestTemplate restTemplate = new RestTemplate();
        LeagueRank[] leagueRank = restTemplate
                .getForObject(url, LeagueRank[].class);
        return leagueRank;

    }
    public ChampionMastery[] callCMRestApi(String region,String id) {
        String url = "https://"+region+".api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/"+id+"?api_key="+key;
        RestTemplate restTemplate = new RestTemplate();
        ChampionMastery[] championMastery = restTemplate
                .getForObject(url, ChampionMastery[].class);
        return championMastery;
    }


    public MatchHistory callMatchHistory(String region, String encryptedAccountId){
        String url = "https://"+region+".api.riotgames.com/lol/match/v4/matchlists/by-account/"+ encryptedAccountId+"?api_key="+key;
        RestTemplate restTemplate = new RestTemplate();
        MatchHistory matchHistory = restTemplate.getForObject(url, MatchHistory.class);
        return matchHistory;
    }

    public GameData callGameDataRestApi(String region, Long matchId){
        String url ="https://"+region+".api.riotgames.com/lol/match/v4/matches/"+ matchId+"?api_key="+key;
        RestTemplate restTemplate = new RestTemplate();
        GameData gameData = restTemplate.getForObject(url, GameData.class);
        return gameData;

    }




}