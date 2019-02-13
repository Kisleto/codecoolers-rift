package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.ChampionMInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChampionMasteryRequest {
    private static String key = "RGAPI-14775a19-0241-4a92-a014-f4c43d81fa9e";
    private static String url = "https://euw1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/1BXjGdM7VgvGrYMBzaeQbVhRUhB9iknpWt4XBtE8614t4o8?api_key="
            +key;

    public ChampionMInfo[] callCMRestApi() {
        RestTemplate restTemplate = new RestTemplate();
        ChampionMInfo[] championMInfo = restTemplate
                .getForObject(url, ChampionMInfo[].class);
        return championMInfo;
    }
}
