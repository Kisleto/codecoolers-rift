package com.example.codecoolers_rift;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.ChampionMastery;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.repository.ChampionMasteryRepository;
import com.example.codecoolers_rift.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class CodecoolersRiftApplication {

    @Autowired
    private ChampionMasteryRepository championMasteryRepository;
    private SummonerRequest summonerRequest;
    private SummonerService summonerService;
    private Summoner summoner;
    private ChampionMastery championMastery;

    public static void main(String[] args) {
        SpringApplication.run(CodecoolersRiftApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {
            ChampionMastery championMastery = ChampionMastery.builder()
                    .championId(summoner.getChampionId())
                    .summonerId(summoner.getId())
                    .championLevel(summoner.getChampionLevel())
                    .championPoints(summoner.getChampionPoints())
                    .build();
            championMasteryRepository.save(championMastery);

        };
    }

}

