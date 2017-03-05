package com.RokomariHospitalManagement.serviceImplementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.RokomariHospitalManagement.entity.PatientEntity;
import com.RokomariHospitalManagement.service.PatientService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@Service
public class PatientServiceImplementation implements PatientService {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<PatientEntity> getPatientList() {
		Session session = sessionFactory.getCurrentSession();
        session.flush();

        return getPatientList();
	}

	@Override
	public PatientEntity getPatientById(int id) {
		Session session = sessionFactory.getCurrentSession();
        PatientEntity patient = (PatientEntity) session.get(PatientEntity.class, id);
        session.flush();

        return patient;
	}

	@Override
	public void addPatient(PatientEntity patient) {
		
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(patient);
        session.flush();
	}

	@Override
	public void editPatient(PatientEntity patient) {
		
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(patient);
        session.flush();
	}

	@Override
	public void deletePatient(PatientEntity patient) {
		Session session = sessionFactory.getCurrentSession();
        session.delete(patient);
        session.flush();
		
	}

}
