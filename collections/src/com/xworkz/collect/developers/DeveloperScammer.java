package com.xworkz.collect.developers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DeveloperScammer {
	public static void main(String[] args) {

		List<String> collection = new ArrayList<String>();
		collection.add("Pacchu");
		collection.add("Prshant");
		collection.add("Pranu");
		collection.add("Abhi");
		collection.add("Vinayak");
		collection.add("Jyoti");
		collection.add("Raji");
		collection.add("Raju");
		collection.add("Shivasai");
		collection.add("Ram");

		System.err.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.err.println("acending order....");
		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			System.out.println(type);
		}

		System.err.println("----------------------------");
		System.err.println("decending...........");
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String type = itr1.next();
			System.out.println(type);
		}

		System.err.println("~~~~~~~~~~~");

		System.err.println("SET");
		Set<String> set1 = new TreeSet<String>();
		set1.add("Pacchu");
		set1.add("Prshant");
		set1.add("Pranu");
		set1.add("Abhi");
		set1.add("Vinayak");
		set1.add("Jyoti");
		set1.add("Raji");
		set1.add("Raju");
		set1.add("Shivasai");
		set1.add("Ram");

		System.out.println(set1.size());
		System.err.println("acending order....");

		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.err.println("----------------------------");
		System.err.println("descending order....");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<String> itr3 = set1.iterator();
		while (itr3.hasNext()) {
			String type1 = itr3.next();
			System.out.println(type1);
		}

	}

}
