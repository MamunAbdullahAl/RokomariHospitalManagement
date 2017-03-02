package com.RokomariHospitalManagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class DoctorController {
	
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