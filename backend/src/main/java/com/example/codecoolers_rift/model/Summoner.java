package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Summoner {


    private Integer profileIconId;
    private String name;
    private Integer summonerLevel;
    @JsonIgnore
    private String id;
    private long championLevel;
    private long championPoints;
    private long championId;
    @JsonProperty("ranks")
    private List<LeagueRank> summonerRank = new ArrayList<>();
    @JsonProperty("mastery_level")
    private List<ChampionMastery> championMasteryArrayList = new ArrayList<>();
    @JsonProperty("match")
    private List<Match> topMatches = new ArrayList<>();
    @JsonProperty("matches")
    private List<MatchHistoryInfo> lastMatches= new ArrayList<>();

    public Summoner() {

    }

    public Summoner(Integer profileIconId, String name, Integer summonerLevel, String id, long championLevel, long championPoints, long championId, List<LeagueRank> summonerRank) {
        this.profileIconId = profileIconId;
        this.name = name;
        this.summonerLevel = summonerLevel;
        this.id = id;
        this.championLevel = championLevel;
        this.championPoints = championPoints;
        this.championId = championId;
        this.summonerRank = summonerRank;
    }


    public Integer getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(Integer profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(Integer summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getChampionLevel() {
        return championLevel;
    }

    public void setChampionLevel(long championLevel) {
        this.championLevel = championLevel;
    }

    public long getChampionPoints() {
        return championPoints;
    }

    public void setChampionPoints(long championPoints) {
        this.championPoints = championPoints;
    }

    public long getChampionId() {
        return championId;
    }

    public void setChampionId(long championId) {
        this.championId = championId;
    }

    public List<LeagueRank> addtoLeaguerank(LeagueRank[] leagueRanks){
        Collections.addAll(summonerRank, leagueRanks);
        return summonerRank;
    }

    public void addtoMasteryRank(ChampionMastery championMastery){
        Collections.addAll(championMasteryArrayList, championMastery);
    }

    public void setSummonerRank(List<LeagueRank> summonerRank) {
        this.summonerRank = summonerRank;
    }

    public void addToTopMatches(Match match){
        topMatches.add(match);
    }

    public void addToLastMatches(MatchHistoryInfo matchHistoryInfo){
        lastMatches.add(matchHistoryInfo);
    }

    public List<Match> getTopMatches() {
        return topMatches;
    }
}