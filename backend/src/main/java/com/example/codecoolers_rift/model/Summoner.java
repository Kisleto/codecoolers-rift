package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Summoner {

    @Id
    @GeneratedValue
    private Long dataId;

    private Integer profileIconId;
    private String name;
    private Integer summonerLevel;
    @JsonIgnore
    private String id;
    private long championLevel;
    private long championPoints;
    private long championId;
    @OneToMany(mappedBy = "summoner", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonProperty("ranks")
    private List<LeagueRank> summonerRank = new ArrayList<>();
    @OneToMany(mappedBy = "summoner", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonProperty("mastery_level")
    private List<ChampionMastery> championMasteryArrayList = new ArrayList<>();
    @OneToMany(mappedBy = "summoner", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})

    public List<LeagueRank> addtoLeaguerank(LeagueRank[] leagueRanks){
        Collections.addAll(summonerRank, leagueRanks);
        return summonerRank;
    }

    public void addtoMasteryRank(ChampionMastery championMastery){
        Collections.addAll(championMasteryArrayList, championMastery);
    }


}
