package com.example.codecoolers_rift.apihandler;

import com.example.codecoolers_rift.model.MatchHistoryInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MatchHistoryRequest {


    public MatchHistoryInfo callRestAPI(String url){
        RestTemplate restTemplate = new RestTemplate();
        MatchHistoryInfo matchHistoryInfo = restTemplate
                .getForObject(url, MatchHistoryInfo.class);
        return matchHistoryInfo;

    }
}
