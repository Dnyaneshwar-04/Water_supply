package com.dk.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dk.spring.controller.WaterSupply;

public interface WaterRepository extends JpaRepository<WaterSupply, String> {

}
