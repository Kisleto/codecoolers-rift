package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @JsonProperty("lane")
    public String lane;
    @JsonProperty("gameId")
    public Integer gameId;
    @JsonProperty("champion")
    public Integer champion;
    @JsonProperty("platformId")
    public String platformId;
    @JsonProperty("timestamp")
    public Integer timestamp;
    @JsonProperty("queue")
    public Integer queue;
    @JsonProperty("role")
    public String role;
    @JsonProperty("season")
    public Integer season;

}