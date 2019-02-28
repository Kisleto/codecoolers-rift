package com.example.codecoolers_rift.model.gameidentity;

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
        "participantId",
        "teamId",
        "championId",
        "stats",
})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Participant {
    @JsonProperty("participantId")
    public Integer participantId;
    @JsonProperty("teamId")
    public Integer teamId;
    @JsonProperty("championId")
    public Integer championId;
    @JsonProperty("stats")
    public Stats stats;

}
