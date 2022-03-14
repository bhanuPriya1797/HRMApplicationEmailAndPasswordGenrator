package com.greatlearning.controller;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeCredentialsService;

public class EmployeeController {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("bhanu", "priya");
		
		EmployeeCredentialsService service = new EmployeeCredentialsService();
		
		Scanner s = new Scanner(System.in);
		
		String genratedEmail ;
		
		char[] genratedPassword;
		
		System.out.println("\n 1 Technical \n 2 Admin \n 3 Human Resource \n 4 Legal");
		
		int option = s.nextInt();
		
		switch (option) {
		case 1:
			
			genratedEmail = service.generateEmail(employee.getFirstName() , employee.getLastName() , "tech");
			genratedPassword = service.generatePassword();
			service.showCredentials(employee, genratedEmail, genratedPassword);
			
			break;
		case 2:
			
			genratedEmail = service.generateEmail(employee.getFirstName() , employee.getLastName() , "admin");
			genratedPassword = service.generatePassword();
			service.showCredentials(employee, genratedEmail, genratedPassword);
			
			break;
			
		case 3:
	
			genratedEmail = service.generateEmail(employee.getFirstName() , employee.getLastName() , "hr");
			genratedPassword = service.generatePassword();
			service.showCredentials(employee, genratedEmail, genratedPassword);
		
		break;
		
		case 4:
			
			genratedEmail = service.generateEmail(employee.getFirstName() , employee.getLastName() , "legal");
			genratedPassword = service.generatePassword();
			service.showCredentials(employee, genratedEmail, genratedPassword);
		
		break;

		default: System.out.println("\n invalid choice");
			break;
		}
		
		
		
	}
	
}
