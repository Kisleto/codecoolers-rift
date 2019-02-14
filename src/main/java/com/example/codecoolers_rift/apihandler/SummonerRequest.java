package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.LeagueRank;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerRequest {


    private static String key = "RGAPI-21d208a9-b1f0-49fa-890e-86632b302139";



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

}