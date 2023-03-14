package com.greatlearning.employee.email.service;

import java.util.Random;

import com.greatlearning.employee.email.model.New_Hiring;

public class CredentialServiceImpl implements CredentialService{
	private static final String COMPANY_DOMAIN = "gl.in";
	private static final int PASSWORD_SIZE = 8;

	@Override
	public String generateEmailAddress(New_Hiring employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		
		return firstName+lastName+"@"+department+COMPANY_DOMAIN;
	}

	@Override
	public String generatePassword() {
		String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCase = capitalCase.toLowerCase();  //"abc...z"
		String nums = "0123456789";
		String splChars = "!@#$%^&*()";
		
		String passwordChars = capitalCase+smallCase+nums+splChars;
		
		String password = "";
		
		Random random = new Random();
		
		
		for(int i=0;i<PASSWORD_SIZE;i++) {
			password = password+ passwordChars.charAt(random.nextInt(passwordChars.length()));
			
		}
		
		
		return password;
	}
	
	
	/*
	 * Dear Harshit your generated credentials are as follows
     *    Email ---> harshitchoudary@tech.abc.com
     *  Password ---> 181E@wF
	 */
	@Override
	public String showCredentials(New_Hiring employee) {
		System.out.println("Dear" +employee.getFirstName() + "your generated credentials are as follows");
		System.out.print("Email   ---> " + employee.getEmailAddress());
		System.out.print("Password---> " + employee.getPassword());
		return null;
		
	}

}
