package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.DoctorMgmtServiceImpl;

@SpringBootApplication
public class BootDataJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaProj01CrudRepositoryApplication.class, args);
//		Object bean = run.getBean("doctorService");
//		DoctorMgmtServiceImpl service=(DoctorMgmtServiceImpl)bean;
//		Doctor doc = new Doctor();
//		doc.setDocName("Rajesh");
//		doc.setSpecialization("Orthopedic");
//		doc.setIncome(90000D);
//		doc.setSddres("Hyderabad");
//		
//		String msg = service.registerDoctor(doc);
//		System.out.println(msg);
	}

}
