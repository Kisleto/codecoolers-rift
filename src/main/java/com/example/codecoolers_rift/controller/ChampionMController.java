package com.example.codecoolers_rift.controller;


import com.example.codecoolers_rift.model.ChampionMastery;
import com.example.codecoolers_rift.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/champion-mastery")
public class ChampionMController {
    @Autowired
    ChampionService championService;

    @RequestMapping(method = RequestMethod.GET)
    public ChampionMastery[] show() {
        return championService.getChampionMastery();
    }

}
