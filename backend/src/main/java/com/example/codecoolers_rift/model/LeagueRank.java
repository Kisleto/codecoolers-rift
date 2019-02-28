package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "tier",
        "summonerName",
        "hotStreak",
        "wins",
        "veteran",
        "losses",
        "rank",
        "leagueName",
        "inactive",
        "freshBlood",
        "position",
        "leagueId",
        "queueType",
        "summonerId",
        "leaguePoints"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LeagueRank {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Summoner summoner;

    @JsonProperty("tier")
    private String tier;
    @JsonProperty("summonerName")
    private String summonerName;
    @JsonProperty("hotStreak")
    private Boolean hotStreak;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("veteran")
    private Boolean veteran;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("leagueName")
    private String leagueName;
    @JsonProperty("inactive")
    private Boolean inactive;
    @JsonProperty("freshBlood")
    private Boolean freshBlood;
    @JsonProperty("position")
    private String position;
    @JsonIgnore
    private String leagueId;
    @JsonProperty("queueType")
    private String queueType;
    @JsonIgnore
    private String summonerId;
    @JsonProperty("leaguePoints")
    private Integer leaguePoints;

}
