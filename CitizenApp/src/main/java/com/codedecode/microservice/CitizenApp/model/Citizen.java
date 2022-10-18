package com.codedecode.microservice.CitizenApp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table
public class Citizen {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column(name="vaccination_centerid")
	private String vaccinationCenterId;
	
	
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

	public String getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(String vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

	
	
	public Citizen() {
	 super();
	}

	public Citizen(int id) {
		this.id = id;
	}

	public Citizen(String name, String vaccinationCenterId) {
		this.name = name;
		this.vaccinationCenterId = vaccinationCenterId;
	}

	public Citizen(int id, String name) {
		this.id = id;
		this.name = name;
	}

	

	

}
