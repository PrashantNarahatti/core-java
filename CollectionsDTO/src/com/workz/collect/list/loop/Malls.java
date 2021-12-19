package com.workz.collect.list.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Malls {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("New South China Mall");
		list.add("Orian Mall");
		list.add("Vegacity Mall");
		list.add("Gopalana Mall");
		list.add("Central Mall");

		System.out.println("using for loop");
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println("==========================");
		System.out.println("using forEach method");
		list.forEach((ele) -> {
			System.out.println(ele);
		});
		System.out.println("===================");

		ListIterator<String> listIterator = list.listIterator(list.size());
		System.err.println("using List Iterator reverse order using ref size");
		while (listIterator.hasPrevious()) {
			String str = listIterator.previous();
			System.out.println(str);
		}
		System.out.println("==========================");
		System.err.println("using list Iterator order");
		ListIterator<String> listIterator1 = list.listIterator();
		while (listIterator1.hasNext()) {
			String str1 = listIterator1.next();
			System.out.println(str1);
		}

	}

}
