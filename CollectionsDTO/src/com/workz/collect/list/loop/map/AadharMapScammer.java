package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharMapScammer {

	public static void main(String[] args) {
		Map<String,String> aadharNoAndName=new HashMap<String,String>();
		aadharNoAndName.put("288100517839", "Raju");
		aadharNoAndName.put("856912347593", "Pacchu");
		aadharNoAndName.put("365214987562", "Pranu");
		aadharNoAndName.put("156948627139", "Vinayak");
		aadharNoAndName.put("259784136259", "Abhi");
		
		Set<String> set=aadharNoAndName.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));;

		System.out.println(System.lineSeparator());
		
		Collection<String> collection=aadharNoAndName.values();
		collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
		
		System.out.println(System.lineSeparator());
		
		Set<Map.Entry<String,String>> entryset=aadharNoAndName.entrySet();
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
