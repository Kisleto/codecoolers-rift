package com.example.codecoolers_rift.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchID {

    @JsonProperty("matches")
    private List<Match> matches = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("matches")
    public List<Match> getMatches() {
        return matches;
    }

    @JsonProperty("matches")
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
