package com.RokomariHospitalManagement.repository;



import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)

@WebAppConfiguration
@Repository
@Transactional
public class PatientRepositoryTest  {
	@Autowired
	PatientRepository patientRepository ;
	
	@Test
	public void findByName()
	{
		
		
	}
}


