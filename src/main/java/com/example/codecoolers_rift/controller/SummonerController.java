package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.model.SummonerInfo;
import com.example.codecoolers_rift.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class SummonerController {

    @Autowired
    SummonerService summonerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<SummonerInfo> show(){
        System.out.println(summonerService.getSummoner());
        List<SummonerInfo> summonerInfos = new ArrayList<>();
        summonerInfos.add(summonerService.getSummoner());
        return summonerInfos;
    }
}