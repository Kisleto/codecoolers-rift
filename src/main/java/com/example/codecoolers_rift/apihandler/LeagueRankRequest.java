package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.LeagueRank;
import com.example.codecoolers_rift.model.MatchHistoryInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LeagueRankRequest {


    public LeagueRank[] callRestAPI(String url){
        RestTemplate restTemplate = new RestTemplate();
        LeagueRank[] leagueRank = restTemplate
                .getForObject(url, LeagueRank[].class);
        return leagueRank;

    }
}

