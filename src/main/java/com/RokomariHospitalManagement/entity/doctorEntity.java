package com.RokomariHospitalManagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DoctorEntity {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	@Column(name="name", length=100)
	private String name; 
	@Column(name="patient_id", length=100)
	private int patient_id; 
	@Column(name="phone", length=100)
	private String phone;
	@Column(name="email", length=100)
	private String email;
	@Column(name="available_date", length=100)
	private Date available_date;
	
	  
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
	public int getPatientId() {  
	    return patient_id;  
	} 
	
	public void setPatientId(int patient_id) {  
	   this.patient_id = patient_id;  
	} 
	
	public String getPhone() {  
	    return phone;  
	}  
	public void setPhone(String phone) {  
	    this.phone = phone;  
	}
	
	public void setAvailableDate(Date available_date) {  
	    this.available_date = available_date;  
	}  
	public Date getAvailableDate() {  
	    return available_date;  
	}  
	
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	  
}  


