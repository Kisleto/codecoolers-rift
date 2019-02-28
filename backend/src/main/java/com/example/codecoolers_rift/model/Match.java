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
@Entity
public class Match {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Summoner summoner;

    @ManyToOne
    private MatchID matchID;

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

}