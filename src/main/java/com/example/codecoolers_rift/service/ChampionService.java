package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.ChampionMasteryRequest;
import com.example.codecoolers_rift.model.ChampionMastery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChampionService {
    @Autowired
    private ChampionMasteryRequest championMasteryRequest;

    public ChampionMastery[] getChampionMastery() {return championMasteryRequest.callCMRestApi();}
}
