package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MatchID {

    @Id
    @GeneratedValue
    private Long id;


    @JsonProperty("matches")
    @OneToMany(mappedBy = "matchID", cascade = CascadeType.PERSIST)
    private List<Match> matches;

}
