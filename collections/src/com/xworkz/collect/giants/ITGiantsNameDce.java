package com.xworkz.collect.giants;

import java.util.Comparator;

public class ITGiantsNameDce implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		
		return name2.compareTo(name1);
	}

}
