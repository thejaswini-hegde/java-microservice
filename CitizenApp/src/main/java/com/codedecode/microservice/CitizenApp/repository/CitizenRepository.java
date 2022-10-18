package com.codedecode.microservice.CitizenApp.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import com.codedecode.microservice.CitizenApp.model.Citizen;

public interface CitizenRepository extends CrudRepository<Citizen,Integer>{


	Iterable<Citizen> findAll();
	
	

}
