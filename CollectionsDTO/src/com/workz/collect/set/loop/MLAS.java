package com.workz.collect.set.loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MLAS {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Narendra Modi");
		set.add("Manmohan Singh");
		set.add("Indira Gandhi");
		set.add("Lal Bahadur");
		set.add("Jawaharlal Nehru");

		System.err.println("using for loop");
		for (String element : set) {
			System.out.println(element);
		}
		System.out.println("==========================");
		System.err.println("using forEach method");
		set.forEach((ele) -> {
			System.out.println(ele);
		});
	}
}