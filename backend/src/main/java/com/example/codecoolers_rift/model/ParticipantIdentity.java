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
        "player",
        "participantId"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ParticipantIdentity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private MatchHistoryInfo matchHistoryInfo;

    @OneToOne(cascade = {CascadeType.ALL})
    private Player player;

    @JsonProperty("participantId")
    private Integer participantId;

}
