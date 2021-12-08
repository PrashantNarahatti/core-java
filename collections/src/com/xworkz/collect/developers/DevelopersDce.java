package com.xworkz.collect.developers;

import java.util.Comparator;

public class DevelopersDce implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		
		return name2.compareTo(name1);
	}
}
