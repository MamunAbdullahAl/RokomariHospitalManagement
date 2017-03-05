package com.RokomariHospitalManagement.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RokomariHospitalManagement.entity.DoctorEntity;
import com.RokomariHospitalManagement.service.DoctorService;


@Controller

public class DoctorController {
	
	
	@Autowired 
	private DoctorService doctorService;
	
	@RequestMapping("/doctor/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable int id, Model model){
        
		DoctorEntity doctor = doctorService.getDoctorById(id);;
		doctorService.deleteDoctor(doctor);

        return "doctor";
    }
	
	 @RequestMapping("/doctor/editDoctor/{id}")
	    public String editDoctor(@PathVariable("id") int id,  Model model){
		 DoctorEntity doctor = doctorService.getDoctorById(id);
		 doctorService.editDoctor(doctor);
	        return "doctor";
	    }
	    
	
	 
	 @RequestMapping("/doctor/addDoctor/{id}")
	    public String showDoctor(@PathVariable int id, Model model){
		 DoctorEntity doctor = doctorService.getDoctorById(id);
	        doctorService.addDoctor(doctor);
	        return "doctor";
	    }
	 
	
	@RequestMapping("/doctor/doctorList")
	public String getDoctors(Model model){
		List<DoctorEntity> doctors = doctorService.getDoctorList();
		
		model.addAttribute("doctors", doctors);
		
		return "doctor";		
	}
	
	
	private static final Logger LOGGER = LoggerFactory
				.getLogger(DoctorController.class);
	
@RequestMapping (value = "/doctor", method = RequestMethod.GET)	
	public String showPatient(@PathVariable("doctor") String doctor, Model model)
	{
	LOGGER.debug("Rendaring patient page" +doctor);
	
	model.addAttribute("doctor", doctor);
		return "doctor";
	}

}





