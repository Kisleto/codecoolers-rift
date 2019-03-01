package com.example.codecoolers_rift.model.gameidentity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "gameId",
        "gameCreation",
        "queueId",
        "mapId",
        "teams",
        "participants",
        "participantIdentities"
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameData {

    @JsonProperty("gameId")
    public Long gameId;
    @JsonProperty("gameCreation")
    public Long gameCreation;
    @JsonProperty("gameDuration")
    public Integer gameDuration;
    @JsonProperty("queueId")
    public Integer queueId;
    @JsonProperty("mapId")
    public Integer mapId;
    @JsonProperty("teams")
    public List<Team> teams = null;
    @JsonProperty("participants")
    public List<Participant> participants = null;
    @JsonProperty("participantIdentities")
    public List<ParticipantIdentity> participantIdentities = null;

}
