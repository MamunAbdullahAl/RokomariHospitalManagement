package com.RokomariHospitalManagement.service;

import java.util.List;


import com.RokomariHospitalManagement.entity.PatientEntity;



public interface PatientService {
	
	List<PatientEntity> getPatientList();

    PatientEntity getPatientById (int id);

    void addPatient(PatientEntity patient);

    void editPatient(PatientEntity patient);

    void deletePatient(PatientEntity patient);

	

}
