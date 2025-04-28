package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {

		System.out.println("doc id ( before save :: "+doctor.getDocId()+" )");
		Doctor doc = doctorRepo.save(doctor);
		System.out.println("Doctor:"+doc);
		return "Doctor obj is saved with id vaalue :: "+doc.getDocId();
	}

	@Override
	public boolean findDoctorByID(Integer id) {

		boolean flag = doctorRepo.existsById(id);
		return flag;
	}

	@Override
	public long showDoctorCount() {

		long count = doctorRepo.count();
		return count;
	}

}
