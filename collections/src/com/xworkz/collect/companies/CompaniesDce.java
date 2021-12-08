package com.xworkz.collect.companies;

import java.util.Comparator;

public class CompaniesDce implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		
		return name2.compareTo(name1);
	}

}
