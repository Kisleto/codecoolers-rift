package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.model.LeagueRank;
import com.example.codecoolers_rift.service.LeagueRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/league-test")
public class LeagueRankController {

    @Autowired
    LeagueRankService leagueRankService;

    @RequestMapping(method = RequestMethod.GET)
    public LeagueRank[] show(){
        return leagueRankService.leagueRank();
    }
}
