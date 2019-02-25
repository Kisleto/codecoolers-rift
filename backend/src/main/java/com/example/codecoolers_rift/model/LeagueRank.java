package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
public class LeagueRank {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tier")
    public String getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(String tier) {
        this.tier = tier;
    }

    @JsonProperty("summonerName")
    public String getSummonerName() {
        return summonerName;
    }

    @JsonProperty("summonerName")
    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    @JsonProperty("hotStreak")
    public Boolean getHotStreak() {
        return hotStreak;
    }

    @JsonProperty("hotStreak")
    public void setHotStreak(Boolean hotStreak) {
        this.hotStreak = hotStreak;
    }

    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @JsonProperty("veteran")
    public Boolean getVeteran() {
        return veteran;
    }

    @JsonProperty("veteran")
    public void setVeteran(Boolean veteran) {
        this.veteran = veteran;
    }

    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("leagueName")
    public String getLeagueName() {
        return leagueName;
    }

    @JsonProperty("leagueName")
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @JsonProperty("inactive")
    public Boolean getInactive() {
        return inactive;
    }

    @JsonProperty("inactive")
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    @JsonProperty("freshBlood")
    public Boolean getFreshBlood() {
        return freshBlood;
    }

    @JsonProperty("freshBlood")
    public void setFreshBlood(Boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("leagueId")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("leagueId")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("queueType")
    public String getQueueType() {
        return queueType;
    }

    @JsonProperty("queueType")
    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    @JsonProperty("summonerId")
    public String getSummonerId() {
        return summonerId;
    }

    @JsonProperty("summonerId")
    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    @JsonProperty("leaguePoints")
    public Integer getLeaguePoints() {
        return leaguePoints;
    }

    @JsonProperty("leaguePoints")
    public void setLeaguePoints(Integer leaguePoints) {
        this.leaguePoints = leaguePoints;
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
