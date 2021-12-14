package com.workz.collect.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothBrandsDAO {

	private Collection<String> clothbrands = new ArrayList<String>();

	public boolean save(String name) {
		return this.clothbrands.add(name);
	}

	public boolean findMatchName(String clothbrands) {
		if (clothbrands != null) {
			if (clothbrands.contains(clothbrands)) {
				System.out.println("cloth brands is matched");
				return true;

			}
		}
		return false;
	}

	public boolean findMatchCaseInsensitive(String name) {
		if (name != null) 
		{
			Iterator<String> itr = clothbrands.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
		
				if (type.equalsIgnoreCase(name)) 
				{
					System.out.println("cloth brands is matched ignore case");
					return true;
				}
			}
		}
		return false;
	}

	public boolean findMatchStartswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = clothbrands.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().startsWith(chars.toUpperCase()))
						{
					System.out.println("cloth brands is matched start with same chars");
					return true;
				}
			}
		}
		return false;
	}
	public boolean findMatchEndswith(String chars) {
		if (chars != null) {
			Iterator<String> itr = clothbrands.iterator();
			while (itr.hasNext()) {
				String type = itr.next();
				if (type.toUpperCase().endsWith(chars.toUpperCase())) {
					System.out.println("cloth brands is matched ends with same chars");
					return true;
				}
			}
		}
		return false;
	}
}
