package com.example.codecoolers_rift.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "seasonId",
        "queueId",
        "gameId",
        "participantIdentities",
        "gameVersion",
        "platformId",
        "gameMode",
        "mapId",
        "gameType",
        "teams"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchHistoryInfo{

        @Id
        @GeneratedValue
        private Long id;

        @ManyToOne
        private Summoner summoner;

        @JsonProperty("seasonId")
        private int seasonId;
        @JsonProperty("queueId")
        private int queueId;
        @JsonProperty("gameId")
        private Long gameId;
        @OneToMany(cascade = {CascadeType.ALL})
        @JsonProperty("participantIdentities")
        private List<ParticipantIdentity> participantIdentities = new ArrayList<ParticipantIdentity>();
        @JsonProperty("gameVersion")
        private String gameVersion;
        @JsonProperty("platformId")
        private String platformId;
        @JsonProperty("gameMode")
        private String gameMode;
        @JsonProperty("mapId")
        private Integer mapId;
        @JsonProperty("gameType")
        private String gameType;

        @JsonProperty("teams")
        @OneToMany(cascade = {CascadeType.ALL})
        private List<Team> teams = new ArrayList<Team>();

}

