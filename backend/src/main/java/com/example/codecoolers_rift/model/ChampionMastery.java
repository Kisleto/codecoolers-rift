package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "championLevel",
        "chestGranted",
        "championPoints",
        "championPointsSinceLastLevel",
        "championPointsUntilNextLevel",
        "summonerId",
        "tokensEarned",
        "championId",
        "lastPlayTime"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ChampionMastery {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Summoner summoner;

    @JsonProperty("championLevel")
    private long championLevel;
    @JsonProperty("chestGranted")
    private boolean chestGranted;
    @JsonProperty("championPoints")
    private long championPoints;
    @JsonProperty("championPointsSinceLastLevel")
    private long championPointsSinceLastLevel;
    @JsonProperty("championPointsUntilNextLevel")
    private long championPointsUntilNextLevel;
    @JsonProperty("summonerId")
    private String summonerId;
    @JsonProperty("tokensEarned")
    private long tokensEarned;
    @JsonProperty("championId")
    private long championId;
    @JsonProperty("lastPlayTime")
    private long lastPlayTime;

}