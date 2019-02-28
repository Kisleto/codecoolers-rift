package com.example.codecoolers_rift.model;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "currentPlatformId",
        "summonerName",
        "matchHistoryUri",
        "platformId",
        "currentAccountId",
        "profileIcon",
        "summonerId",
        "accountId"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "player")
    private ParticipantIdentity participantIdentity;

    @JsonProperty("currentPlatformId")
    private String currentPlatformId;
    @JsonProperty("summonerName")
    private String summonerName;
    @JsonProperty("matchHistoryUri")

    private String matchHistoryUri;
    @JsonProperty("platformId")
    private String platformId;
    @JsonProperty("currentAccountId")
    private String currentAccountId;
    @JsonProperty("profileIcon")
    private Integer profileIcon;
    @JsonProperty("summonerId")
    private String summonerId;
    @JsonProperty("accountId")
    private String accountId;

}

