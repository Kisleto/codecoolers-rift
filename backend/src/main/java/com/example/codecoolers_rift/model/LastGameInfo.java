package com.example.codecoolers_rift.model;


import com.example.codecoolers_rift.model.gameidentity.SummonerStats;
import com.example.codecoolers_rift.model.gameidentity.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LastGameInfo {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "lastGameInfo")
    private Summoner summoner;

    @OneToMany(mappedBy = "lastGameInfo",cascade = CascadeType.ALL)
    List<SummonerStats> blueTeam = new ArrayList<>();
    @OneToMany(mappedBy = "lastGameInfo",cascade = CascadeType.ALL)
    List<SummonerStats> redTeam = new ArrayList<>();

    public void addtoBlue(SummonerStats summonerStats){
        blueTeam.add(summonerStats);
    }

    public void addtoRed(SummonerStats summonerStats){
        redTeam.add(summonerStats);
    }


}
