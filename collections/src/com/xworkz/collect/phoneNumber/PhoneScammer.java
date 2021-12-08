package com.xworkz.collect.phoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhoneScammer {

	public static void main(String[] args) {

		List<Long> collection = new ArrayList<Long>();
		collection.add(9164768473l);
		collection.add(7204735375l);
		collection.add(6362762260l);
		collection.add(9449435637l);
		collection.add(9449939888l);
		collection.add(9483631018l);
		collection.add(9483764433l);
		collection.add(9886288519l);
		collection.add(7202238563l);
		collection.add(7852369456l);

		System.err.println("LIST");
		System.out.println(collection.size());
		Collections.sort(collection);
		System.err.println("acending order....");
		Iterator<Long> itr = collection.iterator();
		while (itr.hasNext()) {
			Long type = itr.next();
			System.out.println(type);
		}

		System.err.println("----------------------------");
		System.err.println("decending...........");
		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Long type = itr1.next();
			System.out.println(type);
		}

		System.err.println("~~~~~~~~~~~");

		System.out.println("SET");
		Set<Long> set1 = new TreeSet<Long>();
		set1.add(9164768473l);
		set1.add(7204735375l);
		set1.add(6362762260l);
		set1.add(9449435637l);
		set1.add(9449939888l);
		set1.add(9483631018l);
		set1.add(9483764433l);
		set1.add(9886288519l);
		set1.add(7202238563l);
		set1.add(7852369456l);

		System.out.println(set1.size());
		System.err.println("acending order....");

		Iterator<Long> itr2 = set1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.err.println("----------------------------");
		System.err.println("descending order....");

		Collections.sort(collection, Collections.reverseOrder());
		Iterator<Long> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			Long type1 = itr3.next();
			System.out.println(type1);
		}

	}

}