package com.xworkz.collect.giants;

import java.util.Comparator;

public class ITGiantsNameAce implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		
		return name1.compareTo(name2);
	}
}
