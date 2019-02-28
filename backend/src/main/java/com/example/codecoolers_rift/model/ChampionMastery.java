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
    @Transient
    private boolean chestGranted;
    @JsonProperty("championPoints")
    private long championPoints;
    @Transient
    @JsonProperty("championPointsSinceLastLevel")
    private long championPointsSinceLastLevel;
    @Transient
    @JsonProperty("championPointsUntilNextLevel")
    private long championPointsUntilNextLevel;
    @JsonProperty("summonerId")
    private String summonerId;
    @Transient
    @JsonProperty("tokensEarned")
    private long tokensEarned;
    @JsonProperty("championId")
    private long championId;
    @Transient
    @JsonProperty("lastPlayTime")
    private long lastPlayTime;

}