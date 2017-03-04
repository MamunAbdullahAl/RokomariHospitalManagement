package com.RokomariHospitalManagement.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RokomariHospitalManagement.entity.PatientEntity;
import com.RokomariHospitalManagement.service.PatientService;





@Controller

public class PatientController {
	
	@Autowired 
	private PatientService patientService;
	
	
	
	@RequestMapping("/patient")
	public String getPatients(Model model){
		List<PatientEntity> patients = patientService.getPatientList();
		
		model.addAttribute("patients", patients);
		
		return "patient";		
	}
	
	
	@RequestMapping("/showPatient/{id}")
    public String showPatient(@PathVariable int id, Model model) throws IOException{
        PatientEntity patient = patientService.getPatientById(id);
        
        model.addAttribute("patient", patient);

        return "patient";
    }
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PatientController.class);
	
@RequestMapping (value = "/patient", method = RequestMethod.GET)	
	public String showPatient(@PathVariable("patient") String patient, Model model)
	{
	LOGGER.debug("Rendaring patient page" +patient);
	
	model.addAttribute("patient", patient);
		return "Patient";
	}

}



