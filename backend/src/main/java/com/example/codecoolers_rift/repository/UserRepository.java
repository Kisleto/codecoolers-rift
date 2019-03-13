package com.example.codecoolers_rift.repository;

import com.example.codecoolers_rift.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, Long> {
}
