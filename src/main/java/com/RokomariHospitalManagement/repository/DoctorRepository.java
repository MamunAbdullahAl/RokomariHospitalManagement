package com.RokomariHospitalManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RokomariHospitalManagement.entity.DoctorEntity;



@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

	public DoctorEntity FindByName(String name);	


}
