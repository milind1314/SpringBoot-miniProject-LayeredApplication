package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class PayRollOperationsController {

	@Autowired
	private IEmployeeService empService;
	
	public PayRollOperationsController() {
		System.out.println("PayRollOperationsController :: 0-param constructor");
	}
	
	public List<Employee> fetchEmployeeByDesigs(String desg1, String desg2, String desg3) throws Exception {
		
		System.out.println("PayRollOperationsController.fetchEmployeeByDesigs()");
		
		List<Employee> list = empService.fetchAllEmployeeByDesignation(desg1, desg2, desg3);
		return list;
		
	}
}
