package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.SummonerInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerRequest {

    private static String url = "https://eun1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Coppeliuss?api_key=RGAPI-00bd3868-51a8-407b-a60c-52fadd68840a";

    public String callRestAPI(){
        RestTemplate restTemplate = new RestTemplate();
        SummonerInfo summonerInfo = restTemplate
                .getForObject(url, SummonerInfo.class);
        return summonerInfo.getName();

    }

}