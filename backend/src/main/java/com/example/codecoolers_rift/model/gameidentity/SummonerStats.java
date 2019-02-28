package com.example.codecoolers_rift.model.gameidentity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SummonerStats {

    private String summonerName;
    private Stats stats;

}
