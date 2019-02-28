package com.example.codecoolers_rift.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "firstDragon",
        "bans",
        "firstInhibitor",
        "win",
        "firstRiftHerald",
        "firstBaron",
        "baronKills",
        "riftHeraldKills",
        "firstBlood",
        "teamId",
        "firstTower",
        "vilemawKills",
        "inhibitorKills",
        "towerKills",
        "dominionVictoryScore",
        "dragonKills"
})


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty("firstDragon")
    private Boolean firstDragon;
    @JsonProperty("firstInhibitor")
    private Boolean firstInhibitor;
    @JsonProperty("win")
    private String win;
    @JsonProperty("firstRiftHerald")
    private Boolean firstRiftHerald;
    @JsonProperty("firstBaron")
    private Boolean firstBaron;
    @JsonProperty("baronKills")
    private Integer baronKills;
    @JsonProperty("riftHeraldKills")
    private Integer riftHeraldKills;
    @JsonProperty("firstBlood")
    private Boolean firstBlood;
    @JsonProperty("teamId")
    private Integer teamId;
    @JsonProperty("firstTower")
    private Boolean firstTower;
    @JsonProperty("vilemawKills")
    private Integer vilemawKills;
    @JsonProperty("inhibitorKills")
    private Integer inhibitorKills;
    @JsonProperty("towerKills")
    private Integer towerKills;
    @JsonProperty("dominionVictoryScore")
    private Integer dominionVictoryScore;
    @JsonProperty("dragonKills")
    private Integer dragonKills;

    @ManyToOne
    private MatchHistoryInfo matchHistoryInfo;

}
