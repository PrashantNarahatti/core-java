package com.workz.collect.dto.beer.functional;

public class FindMatchCaseInSensitive implements StringMatch {

	@Override
	public boolean evaluate(String element, String value) 
	{
		System.out.println("invoked evaluate method of Find Match Case Insensitive");
		
		
		return element.equalsIgnoreCase(value);
	}

}