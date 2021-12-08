package com.xworkz.collect.developers;

import java.util.Comparator;

public class DevelopersAce implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		
		return name1.compareTo(name2);
	}


}
