package com.codedecode.microservice.CitizenApp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import com.codedecode.microservice.CitizenApp.Controller.CitizenController;
import com.codedecode.microservice.CitizenApp.model.Citizen;
import com.codedecode.microservice.CitizenApp.repository.CitizenRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
class CitizenAppApplicationTests {
	
	@Autowired
	CitizenRepository citizenRepo;

	@Test
	void testCreate(){
		
		Citizen citizen = new Citizen(4,"Rama","A_04");
		
		citizen.setId(4);
		citizen.setName("Rama");
		citizen.setVaccinationCenterId("A_04");
		citizenRepo.save(citizen);
		assertNotNull(citizenRepo.findById(4));
		}
	
	/*void contextLoads() {
	
	}*/
	
	
}