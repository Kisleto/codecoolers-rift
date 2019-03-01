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
        "championId",
        "pickTurn"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ban {

    @JsonProperty("championId")
    public Integer championId;
    @JsonProperty("pickTurn")
    public Integer pickTurn;

}