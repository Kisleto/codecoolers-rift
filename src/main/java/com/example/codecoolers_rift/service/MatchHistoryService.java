package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.MatchHistoryRequest;
import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.MatchHistoryInfo;
import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchHistoryService {
    String key = "RGAPI-21d208a9-b1f0-49fa-890e-86632b302139";
    String url = "https://eun1.api.riotgames.com/lol/match/v4/matches/2127877692?api_key="+key;
    @Autowired
    private MatchHistoryRequest matchHistoryRequest;

    public MatchHistoryInfo getSummoner(){
        return matchHistoryRequest.callRestAPI(url);
    }

}

