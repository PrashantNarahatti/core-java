package com.xworkz.collect.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainScammer {
	public static void main(String[] args) {

		List<Long> collection = new ArrayList<Long>();
		collection.add(91647l);
		collection.add(72047l);
		collection.add(63627l);
		collection.add(94494l);
		collection.add(94499l);
		collection.add(94836l);
		collection.add(94837l);
		collection.add(98862l);
		collection.add(72022l);
		collection.add(78523l);

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

		System.err.println("SET");
		Set<Long> set1 = new TreeSet<Long>();
		set1.add(91647l);
		set1.add(72047l);
		set1.add(63627l);
		set1.add(94494l);
		set1.add(94499l);
		set1.add(94836l);
		set1.add(94837l);
		set1.add(98862l);
		set1.add(72022l);
		set1.add(78523l);

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
