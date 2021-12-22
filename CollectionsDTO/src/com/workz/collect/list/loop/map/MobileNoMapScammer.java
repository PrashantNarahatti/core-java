package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileNoMapScammer {

	public static void main(String[] args) {
		Map<String,String> mobileNoAndName=new HashMap<String,String>();
		mobileNoAndName.put("8812517839", "Raju");
		mobileNoAndName.put("6912347593", "Pacchu");
		mobileNoAndName.put("3652149862", "Pranu");
		mobileNoAndName.put("1569486239", "Vinayak");
		mobileNoAndName.put("2597841359", "Abhi");
		
		Set<String> set=mobileNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());
		
		Collection<String> collection=mobileNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
		Set<Map.Entry<String,String>> entryset=mobileNoAndName.entrySet();
		Iterator<Map.Entry<String,String>> itr=entryset.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> element=itr.next();
			System.out.println(element.getKey() . concat( ":").concat(element.getValue()));
			
			System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":").concat(entry.getValue())));
		}

	}

}
