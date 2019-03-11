package com.example.codecoolers_rift.repository;

import com.example.codecoolers_rift.model.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository  extends JpaRepository<Summoner, Long> {
    Summoner findByName(String name);

}
