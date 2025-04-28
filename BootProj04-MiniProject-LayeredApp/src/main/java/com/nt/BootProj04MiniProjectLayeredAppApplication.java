package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayRollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj04MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj04MiniProjectLayeredAppApplication.class, args);
		
		PayRollOperationsController pay = ctx.getBean("empController",PayRollOperationsController.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Designation 1 : ");
		String desig1 = sc.nextLine();
		
		System.out.println("Enter Employee Designation 2 : ");
		String desig2 = sc.nextLine();
		
		System.out.println("Enter Employee Designation 3 : ");
		String desig3 = sc.nextLine();
		
		try {
			List<Employee> list = pay.fetchEmployeeByDesigs(desig1, desig2, desig3);
			
			list.forEach(emp->{
				System.out.println(emp);
			});
		} catch (Exception e) {

			System.err.println("Internal problem -- Try again :: "+e.getMessage());
//			e.printStackTrace();
		}
	
		((ConfigurableApplicationContext) ctx).close();
		sc.close();
	}

}
