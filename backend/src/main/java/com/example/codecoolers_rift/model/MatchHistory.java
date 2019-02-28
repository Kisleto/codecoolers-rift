package com.example.codecoolers_rift.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "matches"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchHistory {

    @JsonProperty("matches")
    public List<Match> matches;
    @JsonProperty("startIndex")
    public Integer startIndex;
    @JsonProperty("endIndex")
    public Integer endIndex;
    @JsonProperty("totalGames")
    public Integer totalGames;


    public List<Long> getMatchids(){
        List<Long> matchIds = new ArrayList<>();
        for (Match match: matches){
            matchIds.add(match.getGameId());
        }
        return matchIds;
    }

}
