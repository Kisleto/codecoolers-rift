package com.example.codecoolers_rift.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;



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

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchHistoryInfo{
        @JsonProperty("seasonId")
        private Integer seasonId;
        @JsonProperty("queueId")
        private Integer queueId;
        @JsonProperty("gameId")
        private Integer gameId;
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
        private List<Team> teams = new ArrayList<Team>();
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("seasonId")
        public Integer getSeasonId() {
            return seasonId;
        }

        @JsonProperty("seasonId")
        public void setSeasonId(Integer seasonId) {
            this.seasonId = seasonId;
        }

        @JsonProperty("queueId")
        public Integer getQueueId() {
            return queueId;
        }

        @JsonProperty("queueId")
        public void setQueueId(Integer queueId) {
            this.queueId = queueId;
        }

        @JsonProperty("gameId")
        public Integer getGameId() {
            return gameId;
        }

        @JsonProperty("gameId")
        public void setGameId(Integer gameId) {
            this.gameId = gameId;
        }

        @JsonProperty("participantIdentities")
        public List<ParticipantIdentity> getParticipantIdentities() {
            return participantIdentities;
        }

        @JsonProperty("participantIdentities")
        public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
            this.participantIdentities = participantIdentities;
        }

        @JsonProperty("gameVersion")
        public String getGameVersion() {
            return gameVersion;
        }

        @JsonProperty("gameVersion")
        public void setGameVersion(String gameVersion) {
            this.gameVersion = gameVersion;
        }

        @JsonProperty("platformId")
        public String getPlatformId() {
            return platformId;
        }

        @JsonProperty("platformId")
        public void setPlatformId(String platformId) {
            this.platformId = platformId;
        }

        @JsonProperty("gameMode")
        public String getGameMode() {
            return gameMode;
        }

        @JsonProperty("gameMode")
        public void setGameMode(String gameMode) {
            this.gameMode = gameMode;
        }

        @JsonProperty("mapId")
        public Integer getMapId() {
            return mapId;
        }

        @JsonProperty("mapId")
        public void setMapId(Integer mapId) {
            this.mapId = mapId;
        }

        @JsonProperty("gameType")
        public String getGameType() {
            return gameType;
        }

        @JsonProperty("gameType")
        public void setGameType(String gameType) {
            this.gameType = gameType;
        }

        @JsonProperty("teams")
        public List<Team> getTeams() {
            return teams;
        }

        @JsonProperty("teams")
        public void setTeams(List<Team> teams) {
            this.teams = teams;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

}

