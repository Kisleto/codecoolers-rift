package com.example.codecoolers_rift.model.gameidentity;


import com.example.codecoolers_rift.model.LastGameInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SummonerStats {

    @Id
    @GeneratedValue
    private Long id;

    private String summonerName;
    @OneToOne(mappedBy = "summonerStats", cascade = CascadeType.ALL)
    private Stats stats;

    @ManyToOne
    private LastGameInfo lastGameInfo;

}
