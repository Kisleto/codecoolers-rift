package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.apihandler.MatchHistoryRequest;
import com.example.codecoolers_rift.model.MatchHistoryInfo;
import com.example.codecoolers_rift.service.MatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MatchHistoryController {

    @Autowired
    MatchHistoryService matchHistoryService;

    @RequestMapping(method = RequestMethod.GET)
    public MatchHistoryInfo show(){
        return matchHistoryService.getSummoner();
    }
}
