package com.RokomariHospitalManagement.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.RokomariHospitalManagement.entity.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

	public PatientEntity FindByName(String name);
	
}
