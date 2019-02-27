package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ChampionMastery {

    public ChampionMastery(long championLevel, boolean chestGranted, long championPoints, long championPointsSinceLastLevel, long championPointsUntilNextLevel, String summonerId, long tokensEarned, long championId, long lastPlayTime) {
        this.championLevel = championLevel;
        this.chestGranted = chestGranted;
        this.championPoints = championPoints;
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
        this.summonerId = summonerId;
        this.tokensEarned = tokensEarned;
        this.championId = championId;
        this.lastPlayTime = lastPlayTime;
    }

    @Id
    @GeneratedValue
    private Long id;

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
    @JsonIgnore
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("lastPlayTime")
    private long lastPlayTime;

    @JsonProperty("championLevel")
    public long getChampionLevel() {
        return championLevel;
    }

    @JsonProperty("championLevel")
    public void setChampionLevel(long championLevel) {
        this.championLevel = championLevel;
    }

    @JsonProperty("chestGranted")
    public boolean isChestGranted() {
        return chestGranted;
    }

    @JsonProperty("chestGranted")
    public void setChestGranted(boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    @JsonProperty("championPoints")
    public long getChampionPoints() {
        return championPoints;
    }

    @JsonProperty("championPoints")
    public void setChampionPoints(long championPoints) {
        this.championPoints = championPoints;
    }

    @JsonProperty("championPointsSinceLastLevel")
    public long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    @JsonProperty("championPointsSinceLastLevel")
    public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    @JsonProperty("championPointsUntilNextLevel")
    public long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    @JsonProperty("championPointsUntilNextLevel")
    public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    @JsonProperty("summonerId")
    public String getSummonerId() {
        return summonerId;
    }

    @JsonProperty("summonerId")
    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    @JsonProperty("tokensEarned")
    public long getTokensEarned() {
        return tokensEarned;
    }

    @JsonProperty("tokensEarned")
    public void setTokensEarned(long tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    @JsonProperty("championId")
    public long getChampionId() {
        return championId;
    }

    @JsonProperty("championId")
    public void setChampionId(long championId) {
        this.championId = championId;
    }

    @JsonProperty("lastPlayTime")
    public long getLastPlayTime() {
        return lastPlayTime;
    }

    @JsonProperty("lastPlayTime")
    public void setLastPlayTime(long lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
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