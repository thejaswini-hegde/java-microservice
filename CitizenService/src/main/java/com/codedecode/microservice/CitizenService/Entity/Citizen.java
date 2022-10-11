package com.codedecode.microservice.CitizenService.Entity;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

/*import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;*/


@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int vaccinationCenterID;
    
	public Citizen(int id, String name, int vaccinationCenterID) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationCenterID = vaccinationCenterID;
	}

	public Citizen() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterID() {
		return vaccinationCenterID;
	}

	public void setVaccinationCenterID(int vaccinationCenterID) {
		this.vaccinationCenterID = vaccinationCenterID;
	}

	
	
}
