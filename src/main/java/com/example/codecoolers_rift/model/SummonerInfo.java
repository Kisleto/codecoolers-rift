package com.example.codecoolers_rift.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;


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

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public String getPuuid() {
        return puuid;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getId() {
        return id;
    }

    public Long getRevisionDate() {
        return revisionDate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}