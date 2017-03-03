package com.RokomariHospitalManagement.entity;

import java.util.Date;


public class DoctorEntity {
   
	private int id;  
	private String name;  
	private int patient_id;  
	private String phone;
	private String email;
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


