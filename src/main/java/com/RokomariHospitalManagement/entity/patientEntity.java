package com.RokomariHospitalManagement.entity;

import java.util.Date;



public class patientEntity {
   
	private int id;  
	private String name;  
	private String address;  
	private String phone;
	private Date appointment_date;
	private int doctor_id;
	  
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
	public String getAddress() {  
	    return address;  
	}  
	
	public String getPhone() {  
	    return phone;  
	}  
	public void setPhone(String phone) {  
	    this.phone = phone;  
	}
	
	public void setAppointmentDate(Date appointment_date) {  
	    this.appointment_date = appointment_date;  
	}  
	public Date getAppointmentDate() {  
	    return appointment_date;  
	}  
	
	public int getDoctorId() {  
	    return doctor_id;  
	}  
	public void setDoctorId(int doctor_id) {  
	    this.doctor_id = id;  
	}  
	  
}  


