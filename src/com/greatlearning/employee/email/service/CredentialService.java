package com.greatlearning.employee.email.service;

import com.greatlearning.employee.email.model.New_Hiring;

public interface CredentialService {
	public String generateEmailAddress(New_Hiring employee);
	public String generatePassword();
	public String showCredentials(New_Hiring employee);


}
