package com.RokomariHospitalManagement.serviceImplementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RokomariHospitalManagement.entity.DoctorEntity;

import com.RokomariHospitalManagement.service.DoctorService;

@Service

public class DoctorServiceImplementation  implements DoctorService {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<DoctorEntity> getDoctorList() {
		Session session = sessionFactory.getCurrentSession();
        session.flush();

        return getDoctorList();
	}

	@Override
	public DoctorEntity getDoctorById(int id) {
		Session session = sessionFactory.getCurrentSession();
        DoctorEntity doctor = (DoctorEntity) session.get(DoctorEntity.class, id);
        session.flush();

        return doctor;
	}

	@Override
	public void addDoctor(DoctorEntity doctor) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(doctor);
        session.flush();
		
	}

	@Override
	public void editDoctor(DoctorEntity doctor) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(doctor);
        session.flush();
		
	}

	@Override
	public void deleteDoctor(DoctorEntity doctor) {
		Session session = sessionFactory.getCurrentSession();
        session.delete(doctor);
        session.flush();
		
	}

}
