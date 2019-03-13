package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.repository.SummonerRepository;
import com.example.codecoolers_rift.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@CrossOrigin
@RestController
@RequestMapping("/{region}/{name}")
public class SummonerController {

    @Autowired
    SummonerService summonerService;

    @Autowired
    SummonerRepository summonerRepository;

    @Autowired
    EntityManager entityManager;

    @RequestMapping(method = RequestMethod.GET)
    public Summoner getSummonerJSONFromBackend(@PathVariable("region") String region, @PathVariable("name") String name){
        Summoner summoner = summonerService.getSummoner(region, name);
        if (!recordExists(name)) {
            saveSummonerToDatabase(summoner);
        }
       return findSummonerByNameFromDB(name);
    }

    private void saveSummonerToDatabase(Summoner summoner) {
        summonerRepository.save(summoner);
    }

    private Summoner findSummonerByNameFromDB(String name) {
        return summonerRepository.findByName(name);
    }

    private boolean recordExists(String name) {
        Long count = summonerRepository.countByName(name);
        return (!count.equals(0L));
    }
}