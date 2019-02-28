package com.example.codecoolers_rift.repository;

import com.example.codecoolers_rift.model.ChampionMastery;
import com.example.codecoolers_rift.model.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChampionMasteryRepository extends JpaRepository<ChampionMastery, Long> {
    boolean existsAllByChampionIdIsNotNull();
}
