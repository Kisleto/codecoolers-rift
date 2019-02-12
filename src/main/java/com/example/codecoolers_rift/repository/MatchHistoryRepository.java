package com.example.codecoolers_rift.repository;

import com.example.codecoolers_rift.model.MatchHistoryInfo;
import org.springframework.data.repository.CrudRepository;

public interface MatchHistoryRepository extends CrudRepository<MatchHistoryInfo, Long> {
}
