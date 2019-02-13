package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.LeagueRankRequest;
import com.example.codecoolers_rift.model.LeagueRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueRankService {

    String key = "RGAPI-21d208a9-b1f0-49fa-890e-86632b302139";
    String url = "https://eun1.api.riotgames.com/lol/league/v4/positions/by-summoner/biyaR54TGkuAIz7nFy6V7Bu3flqeuiAGnx7TLpZqhGihVAA?api_key="+key;

    @Autowired
    private LeagueRankRequest leagueRankRequest;

    public LeagueRank[] leagueRank(){
        return leagueRankRequest.callRestAPI(url);
    }

}