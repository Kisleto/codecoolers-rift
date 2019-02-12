package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerRequest {


    private static String key = "RGAPI-14775a19-0241-4a92-a014-f4c43d81fa9e";
    private static String url = "https://eun1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Coppeliuss?api_key="+key;


    public SummonerInfo callRestAPI(){
        RestTemplate restTemplate = new RestTemplate();
        SummonerInfo summonerInfo = restTemplate
                .getForObject(url, SummonerInfo.class);
        return summonerInfo;

    }

}