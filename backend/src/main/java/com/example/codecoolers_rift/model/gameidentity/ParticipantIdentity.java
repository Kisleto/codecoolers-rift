package com.example.codecoolers_rift.model.gameidentity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "participantId",
        "player"
})
@JsonIgnoreProperties(ignoreUnknown = true)


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParticipantIdentity {
    @JsonProperty("participantId")
    public Integer participantId;
    @JsonProperty("player")
    public Player player;
}
