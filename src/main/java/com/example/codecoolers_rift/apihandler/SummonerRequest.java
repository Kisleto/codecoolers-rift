package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerRequest {


    private static String key = "RGAPI-21d208a9-b1f0-49fa-890e-86632b302139";
    private static String url = "https://eun1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Coppeliuss?api_key="+key;


    public SummonerInfo callRestAPI(){
        RestTemplate restTemplate = new RestTemplate();
        SummonerInfo summonerInfo = restTemplate
                .getForObject(url, SummonerInfo.class);
        return summonerInfo;

    }

}