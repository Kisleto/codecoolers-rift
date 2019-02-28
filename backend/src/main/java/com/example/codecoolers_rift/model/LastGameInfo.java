package com.example.codecoolers_rift.model;


import com.example.codecoolers_rift.model.gameidentity.SummonerStats;
import com.example.codecoolers_rift.model.gameidentity.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LastGameInfo {

    List<SummonerStats> blueTeam = new ArrayList<>();
    List<SummonerStats> redTeam = new ArrayList<>();

    public void addtoBlue(SummonerStats summonerStats){
        blueTeam.add(summonerStats);
    }

    public void addtoRed(SummonerStats summonerStats){
        redTeam.add(summonerStats);
    }


}
