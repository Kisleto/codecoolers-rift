package com.example.codecoolers_rift.service;


import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.LastGameInfo;
import com.example.codecoolers_rift.model.Summoner;
import com.example.codecoolers_rift.model.gameidentity.GameData;
import com.example.codecoolers_rift.model.gameidentity.Participant;
import com.example.codecoolers_rift.model.gameidentity.ParticipantIdentity;
import com.example.codecoolers_rift.model.gameidentity.SummonerStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchHistoryService {

    @Autowired
    private SummonerRequest summonerRequest;

    public LastGameInfo fillLastGameInfo(String region, Long matchId){
        LastGameInfo lastGameInfo = new LastGameInfo();
        GameData gameData = summonerRequest.callGameDataRestApi(region, matchId);
        List<Participant> participants = gameData.getParticipants();
        List<ParticipantIdentity> participantIdentities = gameData.getParticipantIdentities();
        for (Participant participant: participants){
            SummonerStats summonerStats = new SummonerStats();
            for (ParticipantIdentity participantIdentity: participantIdentities){
                if (participant.getParticipantId().equals(participantIdentity.getParticipantId())){
                    summonerStats.setSummonerName(participantIdentity.getPlayer().getSummonerName());
                }
            }
            summonerStats.setStats(participant.stats);
            if (participant.getTeamId() == 100){
                lastGameInfo.addtoBlue(summonerStats);
            }
            else if (participant.getTeamId() == 200){
                lastGameInfo.addtoRed(summonerStats);
            }
        }

        return lastGameInfo;
    }


}
