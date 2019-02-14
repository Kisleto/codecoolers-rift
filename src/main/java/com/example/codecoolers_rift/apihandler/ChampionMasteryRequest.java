package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.ChampionMastery;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChampionMasteryRequest {
    private static String key = "RGAPI-21d208a9-b1f0-49fa-890e-86632b302139";
    private static String url = "https://euw1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/1BXjGdM7VgvGrYMBzaeQbVhRUhB9iknpWt4XBtE8614t4o8?api_key="
            +key;

    public ChampionMastery[] callCMRestApi() {
        RestTemplate restTemplate = new RestTemplate();
        ChampionMastery[] championMInfo = restTemplate
                .getForObject(url, ChampionMastery[].class);
        return championMInfo;
    }
}
