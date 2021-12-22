package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapScammer {

	public static void main(String[] args) {
		// name,place
		Map<String, String> nameAndPlaceMap = new HashMap<String, String>();
		nameAndPlaceMap.put("Pacchu", "Bagalkot");
		nameAndPlaceMap.put("Raju", "Gangavathi");
		nameAndPlaceMap.put("Shivasai", "Bidar");
		nameAndPlaceMap.put("Pranu", "Bengalore");
		nameAndPlaceMap.put("Abhijeet", "Auranabad");

		Set<String> set = nameAndPlaceMap.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(System.lineSeparator());

		Collection<String> collection = nameAndPlaceMap.values();
		collection.forEach((v) -> System.out.println(v));

		System.out.println(System.lineSeparator());

		Set<Map.Entry<String, String>> entryset = nameAndPlaceMap.entrySet();
		Iterator<Map.Entry<String, String>> itr = entryset.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> element = itr.next();
			System.out.println(element.getKey().concat(": ").concat(element.getValue()));

			System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}
	}

}
