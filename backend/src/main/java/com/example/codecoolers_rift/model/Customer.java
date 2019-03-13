package com.example.codecoolers_rift.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
    @OneToOne(mappedBy = "customer")
    private Summoner summoner;
    private boolean codeCooler;
    private String summonerName;
}
