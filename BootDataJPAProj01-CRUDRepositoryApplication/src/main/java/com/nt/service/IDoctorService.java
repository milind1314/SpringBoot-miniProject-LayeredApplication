package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor); 
	public boolean findDoctorByID(Integer id);
	public long showDoctorCount();

}
