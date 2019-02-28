package com.example.codecoolers_rift;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.controller.SummonerController;
import com.example.codecoolers_rift.model.ChampionMastery;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.repository.ChampionMasteryRepository;
import com.example.codecoolers_rift.service.SummonerService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class CodecoolersRiftApplication {

    @Autowired
    private ChampionMasteryRepository championMasteryRepository;
    @Autowired
    private SummonerService summonerService;
    @Autowired
    private SummonerRequest summonerRequest;
    @Autowired
    private SummonerController summonerController;

    public static void main(String[] args) {
        SpringApplication.run(CodecoolersRiftApplication.class, args);
    }

}

