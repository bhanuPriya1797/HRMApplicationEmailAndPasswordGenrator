package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeCredentialsService {		
	

	public char[] generatePassword() {
		
		char password[] = new char [8];
		String capitalLetter = "ABCDEFGHIJKLMNOPQRXYZ";
		String lowerLetter = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";		
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = num + capitalLetter +  lowerLetter  + specialCharacters;
		
		Random random = new Random();
		
		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as 
			password[i] = values.charAt(random.nextInt(values.length()));

		}

		
		return password;
	}
	public String generateEmail(String firstName, String lastName, String department)
	{
		return firstName + lastName +  "@" + department + ".greatlearning.com";
	}	
	public void showCredentials(Employee employee , String email, char[] generatedPassword) {
		
		System.out.println("\n Dear " + employee.getFirstName() + " your generated credentials are as follows : ") ;
		System.out.println("\n Email : " + email);
		System.out.println("\n Password : " + generatedPassword);
	
	
	}

}
