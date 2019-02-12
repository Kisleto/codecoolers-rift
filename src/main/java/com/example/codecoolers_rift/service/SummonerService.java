package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerService {

    @Autowired
    private SummonerRequest summonerRequest;

    public SummonerInfo getSummoner(){
        return summonerRequest.callRestAPI();
    }

}
