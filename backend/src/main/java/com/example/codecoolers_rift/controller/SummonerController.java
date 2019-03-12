package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.model.SummonerInfo;
import com.example.codecoolers_rift.repository.SummonerRepository;
import com.example.codecoolers_rift.service.SummonerService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/{region}/{name}")
public class SummonerController {

    @Autowired
    SummonerService summonerService;

    @Autowired
    SummonerRepository summonerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Summoner getSummonerJSONFromBackend(@PathVariable("region") String region, @PathVariable("name") String name){
       Summoner summoner = summonerService.getSummoner(region, name);
       if (summonerRepository.findByName(name) == summoner) {
           return findSummonerByNameFromDB(name);
       }
        return saveSummonerToDatabase(summoner);
    }

    private Summoner saveSummonerToDatabase(Summoner summoner) {
        return summonerRepository.save(summoner);
    }

    private Summoner findSummonerByNameFromDB(String name) {
        return summonerRepository.findByName(name);
    }

}