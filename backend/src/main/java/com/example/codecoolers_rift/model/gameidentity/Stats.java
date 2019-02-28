package com.example.codecoolers_rift.model.gameidentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Stats {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private SummonerStats summonerStats;

    @JsonProperty("participantId")
    public Integer participantId;
    @JsonProperty("win")
    public Boolean win;
    @JsonProperty("kills")
    public Integer kills;
    @JsonProperty("deaths")
    public Integer deaths;
    @JsonProperty("assists")
    public Integer assists;
    @JsonProperty("largestKillingSpree")
    public Integer largestKillingSpree;
    @JsonProperty("largestMultiKill")
    public Integer largestMultiKill;

}
