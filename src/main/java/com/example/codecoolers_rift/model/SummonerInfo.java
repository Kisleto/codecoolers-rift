package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.XmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "profileIconId",
        "name",
        "puuid",
        "summonerLevel",
        "accountId",
        "id",
        "revisionDate"
})

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummonerInfo {

    @JsonProperty("profileIconId")
    private Integer profileIconId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("puuid")
    private String puuid;
    @JsonProperty("summonerLevel")
    private Integer summonerLevel;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("revisionDate")
    private Long revisionDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public SummonerInfo(Integer profileIconId, String name, String puuid,
                        Integer summonerLevel, String accountId, String id,
                        Long revisionDate, Map<String, Object> additionalProperties) {
        this.profileIconId = profileIconId;
        this.name = name;
        this.puuid = puuid;
        this.summonerLevel = summonerLevel;
        this.accountId = accountId;
        this.id = id;
        this.revisionDate = revisionDate;
        this.additionalProperties = additionalProperties;
    }

    public SummonerInfo() {
    }

    public String getName() {
        return name;
    }

    public Integer getSummonerLevel() {
        return summonerLevel;
    }
}