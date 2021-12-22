package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapScammer {

	public static void main(String[] args) {
		Map<String, String> nameAndStates = new HashMap<String, String>();
		nameAndStates.put("India", "Karnataka");
		nameAndStates.put("Australia", "Tasmania");
		nameAndStates.put("Germany", "Bavaria");
		nameAndStates.put("Bangladesh", "Chittagong");
		nameAndStates.put("Sri lanka", "Mannar");

		Set<String> set = nameAndStates.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Collection<String> collection = nameAndStates.values();
		collection.forEach((v) -> System.out.println(v));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String, String>> entryset = nameAndStates.entrySet();
		Iterator<Map.Entry<String, String>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(": ").concat(element.getValue()));

			System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}
	}

}
