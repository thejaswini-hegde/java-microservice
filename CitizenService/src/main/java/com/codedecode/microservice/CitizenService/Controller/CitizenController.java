package com.codedecode.microservice.CitizenService.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import com.codedecode.microservice.CitizenService.Entity.Citizen;
import com.codedecode.microservice.CitizenService.repositories.CitizenRepo;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo repo;
	
	@RequestMapping(path="/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("hello", HttpStatus.OK);
		
	}
	
	@PostMapping(path="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
		
		Citizen citizen = repo.save(newCitizen);
		return new ResponseEntity<>(citizen, HttpStatus.OK);
	}
	
	
	
}
