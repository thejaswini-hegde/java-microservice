package com.codedecode.microservice.CitizenApp.Controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

import com.codedecode.microservice.CitizenApp.services.CitizenService;
import com.codedecode.microservice.CitizenApp.model.Citizen;

@RestController

public class CitizenController {
	
	@Autowired
	CitizenService citizenService;
	
	@GetMapping("/citizen")
	private List<Citizen> getAllCitizens()
	{
		return citizenService.getAllCitizens();
		
	}
	
	@GetMapping("/citizen/{id}")
	private Citizen getCitizens(@PathVariable("id")int id)
	{
		return citizenService.getCitizenById(id);
	}
	
	@DeleteMapping("/citizen/{id}")
	private void deleteCitizen(@PathVariable("id")int id)
	{
		citizenService.delete(id);
	}
	
	@PostMapping("/citizens")
	private int saveCitizen(@RequestBody Citizen citizens)
	{
		citizenService.saveOrUpdate(citizens);
		return citizens.getId();
	}
	
	@PutMapping("/citizens")
	private Citizen update(@RequestBody Citizen citizens)
	{
		citizenService.saveOrUpdate(citizens);
		return citizens;
	}
	

}
