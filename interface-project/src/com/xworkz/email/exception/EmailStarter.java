package com.xworkz.email.exception;

import com.xworkz.email.EmailOperator;
import com.xworkz.email.EmailValidationException;
import com.xworkz.email.StorageFullRunTimeException;

public class EmailStarter {
	public static void main(String[] args) throws EmailValidationException, StorageFullRunTimeException {
		EmailOperator emailoperator = new EmailOperator();
		emailoperator.save("prashantnarahatti@gmail.com");
	}

}
