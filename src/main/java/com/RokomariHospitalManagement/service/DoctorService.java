package com.RokomariHospitalManagement.service;

import java.util.List;

import com.RokomariHospitalManagement.entity.DoctorEntity;

public interface DoctorService {
	
	List<DoctorEntity> getDoctorList();

	DoctorEntity getDoctorById (int id);

    void addDoctor(DoctorEntity doctor);

    void editDoctor(DoctorEntity doctor);

    void deleteDoctor(DoctorEntity doctor);

}
