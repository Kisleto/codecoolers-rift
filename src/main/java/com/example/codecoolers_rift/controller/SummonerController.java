package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SummonerController {

    @Autowired
    SummonerService summonerService;

    @RequestMapping(method = RequestMethod.GET)
    public String show(){
        System.out.println(summonerService.getSummoner());
        return summonerService.getSummoner();
    }
}