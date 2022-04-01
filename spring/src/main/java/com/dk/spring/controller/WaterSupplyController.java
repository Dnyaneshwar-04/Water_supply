package com.dk.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.dk.spring.repository.WaterRepository;
import com.dk.spring.service.WaterSupplyService;

@RestController

public class WaterSupplyController {
	
	@Autowired
	WaterRepository repository;
	@Autowired
	WaterSupplyService watersupplyservice;
	
	@PostMapping("/addArea")
	public ResponseEntity  addAreaImpl(@RequestBody WaterSupply watersupply)
	{   
		AddResponse ad=new AddResponse();
		repository.save(watersupply);
		ad.setMsg("The Area is Added");
	    return new ResponseEntity<AddResponse>(ad,HttpStatus.CREATED);

	}
	@GetMapping("/getArea/{name}")
	public WaterSupply getArea(@PathVariable(value="name")String name) {
		try{
		WaterSupply wat=repository.findById(name).get();
		return wat;
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/getArea/{name}")
	public void deleteArea(@PathVariable(value="name")String name) {
		repository.deleteById(name);
		
	}
 
	@PutMapping("/update/{name}")
	public String  edit(@PathVariable String name , @RequestBody WaterSupply watersupply)
	{   	
		return watersupplyservice.edit(name,watersupply);
	}	
}
