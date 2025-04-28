package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.entity.Doctor;
import com.nt.service.DoctorMgmtServiceImpl;
import com.nt.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner{

    private final DoctorMgmtServiceImpl doctorService;

    @Autowired
	private IDoctorService docService;

    CrudRepoTestRunner(DoctorMgmtServiceImpl doctorService) {
        this.doctorService = doctorService;
    }

	@Override
	public void run(String... args) {
          System.out.println("CrudRepoTestRunner.run()");
          
			/*    Scanner sc = new Scanner(System.in);
			  
			  System.out.print("Enter Doctor name to insert :: ");
			  String name = sc.nextLine();
			  System.out.println();
			  
			  System.out.print("Specialization :: ");
			  String expert = sc.nextLine();
			  System.out.println();
			  
			  System.out.print("Income :: ");
			  double income = Double.parseDouble(sc.nextLine());
			  System.out.println();
			  
			  System.out.print("Address :: ");
			  String address = sc.nextLine();
			  System.out.println();
			try {
				Doctor doc = new Doctor();
				doc.setDocName(name);
				doc.setSpecialization(expert);
				doc.setIncome(income);
				doc.setSddres(address);
				
				String msg = docService.registerDoctor(doc);
				System.out.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.close();*/
          
          
          
          
			/* try {
			System.out.println("Doctors Available :: "+doctorService.showDoctorCount());
			} catch (Exception e) {
			e.printStackTrace();
			}*/
          
          
          try {
			System.out.println("Is Doctor Exist :: "+docService.findDoctorByID(102));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
