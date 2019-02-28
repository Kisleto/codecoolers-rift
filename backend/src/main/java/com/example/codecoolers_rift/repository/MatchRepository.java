package com.example.codecoolers_rift.repository;

import com.example.codecoolers_rift.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
