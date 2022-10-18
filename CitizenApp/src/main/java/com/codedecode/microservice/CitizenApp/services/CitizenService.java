package com.codedecode.microservice.CitizenApp.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.codedecode.microservice.CitizenApp.model.Citizen;  
import com.codedecode.microservice.CitizenApp.repository.CitizenRepository;  

@Service
public class CitizenService {

	@Autowired
	CitizenRepository citizenRepo;
	public List<Citizen> getAllCitizens()
	{
		List<Citizen> citizens = new ArrayList<Citizen>();
		citizenRepo.findAll().forEach(citizen1 -> citizens.add(citizen1));
		return citizens;
	}
	
	public Citizen getCitizenById(int id)
	{
		return citizenRepo.findById(id).get();
	}
	
	public void saveOrUpdate(Citizen citizens)
	{
		citizenRepo.save(citizens);
	}
	
	public void delete(int id)
	{
		citizenRepo.deleteById(id);
	}
	
	public void update(Citizen citizens, int id)
	{
		citizenRepo.save(citizens);
	}

}
