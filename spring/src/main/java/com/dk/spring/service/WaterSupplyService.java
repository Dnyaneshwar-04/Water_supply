package com.dk.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.spring.controller.WaterSupply;
import com.dk.spring.repository.WaterRepository;

@Service
public class WaterSupplyService {
	
	@Autowired
	WaterRepository repository;
     
	
	public boolean checkAreaAlreadyExist(String name)
	{
		Optional<WaterSupply>wat=repository.findById(name);
		if(wat.isPresent())
			return true;
		else
			return false;
	}


	public String edit(String name, WaterSupply watersupply) {
		// TODO Auto-generated method stub
		repository.save(watersupply);
		return "successfully Updated";
	}
}
