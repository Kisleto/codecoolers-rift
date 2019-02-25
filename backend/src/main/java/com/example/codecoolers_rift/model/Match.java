package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lane",
        "gameId",
        "champion",
        "platformId",
        "timestamp",
        "queue",
        "role",
        "season"
})
public class Match {

    @JsonProperty("lane")
    private String lane;
    @JsonProperty("gameId")
    private long gameId;
    @JsonProperty("champion")
    private Integer champion;
    @JsonProperty("platformId")
    private String platformId;
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("queue")
    private Integer queue;
    @JsonProperty("role")
    private String role;
    @JsonProperty("season")
    private Integer season;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public long getGameId() {
        return gameId;
    }
}