package com.example.codecoolers_rift.service;

import com.example.codecoolers_rift.apihandler.SummonerRequest;
import com.example.codecoolers_rift.model.*;
import com.example.codecoolers_rift.repository.ChampionMasteryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SummonerService {

    @Autowired
    private SummonerRequest summonerRequest;
    @Autowired
    private ChampionMasteryRepository championMasteryRepository;
    private ChampionMastery championMastery;
    private SummonerInfo summonerInfo;
    private Summoner summoner;

    public Summoner getSummoner(String region, String name){

        /*if (championMasteryRepository.existsBySummonerId()) {
            System.out.println("Already exist");
        } else {
            saveToDatabase();
        }*/

        summonerInfo = summonerRequest.callRestAPI(region, name);
        LeagueRank[] leagueRank = summonerRequest.callRankRestAPI(region, summonerInfo.getId());
        ChampionMastery[] championMasteries = summonerRequest.callCMRestApi(region, summonerInfo.getId());
        MatchID matches = summonerRequest.callMatchIDRestApi(region, summonerInfo.getAccountId());
        fillSummonerData();
        fillRankData(summoner, leagueRank);
        fillMasteryData(summoner, championMasteries);
        fillMatchIDData(summoner, matches);
        for (Match match: summoner.getTopMatches()) {
            MatchHistoryInfo currentGame = summonerRequest.callMatchRestAPI(region, match.getGameId());
            fillMatchHistory(summoner, currentGame);
        }
        return summoner;
    }

    public void saveToDatabase() {
        ChampionMastery championMastery = ChampionMastery.builder()
                .championId(summoner.getChampionId())
                .build();

        championMasteryRepository.save(championMastery);


    }

    public void searchFromDatabase() {

    }

    private void fillSummonerData(){
        summoner = new Summoner();
        summoner.setName(summonerInfo.getName());
        summoner.setProfileIconId(summonerInfo.getProfileIconId());
        summoner.setSummonerLevel(summonerInfo.getSummonerLevel());
        summoner.setId(summonerInfo.getId());
    }

    private void fillRankData(Summoner summoner, LeagueRank[] leagueRanks){
        summoner.setSummonerRank(summoner.addtoLeaguerank(leagueRanks));

    }

    //Ez kell nekem (Peti)
    private void fillMasteryData(Summoner summoner, ChampionMastery[] championMasteries){
        for (int i=0; i <3; i++){
            summoner.addtoMasteryRank(championMasteries[i]);
        }
    }

    private void fillMatchIDData(Summoner summoner, MatchID matchID){
        List<Match> topMatches = matchID.getMatches();
        for (int i=0; i < 5; i++){
            summoner.addToTopMatches(topMatches.get(i));
        }
    }

    private void fillMatchHistory(Summoner summoner, MatchHistoryInfo matchHistoryInfo){
        summoner.addToLastMatches(matchHistoryInfo);
    }

}
