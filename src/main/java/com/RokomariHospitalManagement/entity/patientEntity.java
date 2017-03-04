package com.RokomariHospitalManagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PatientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name", length=100)
	private String name;
	@Column(name="address", length=100)
	private String address; 
	@Column(name="phone", length=100)
	private String phone;
	@Column(name="appointment_date", length=100)
	private Date appointment_date;
	@Column(name="doctor_id", length=100)
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
	public void setAddress(String address) {  
	    this.address = address;  
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


