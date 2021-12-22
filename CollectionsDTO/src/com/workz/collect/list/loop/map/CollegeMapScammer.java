package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegeMapScammer {

	public static void main(String[] args) {
		Map<String,Integer> nameAndTotalStudents= new HashMap<String,Integer>();
		nameAndTotalStudents.put("S B Patil",300);
		nameAndTotalStudents.put("SKSVMACET",350);
		nameAndTotalStudents.put("Basaveshwar",180);
		nameAndTotalStudents.put("Vagdevi",475);
		nameAndTotalStudents.put("Venkateshwar",545);

		Set<String> set=nameAndTotalStudents.keySet();
        set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Collection<Integer> collection=nameAndTotalStudents.values();
        collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Set<Map.Entry<String, Integer>> entryset=nameAndTotalStudents.entrySet();
        Iterator<Map.Entry<String,Integer>> itr=entryset.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String,Integer> element =itr.next();
        	System.out.println(element.getKey().concat(":") .concat(String.valueOf(element.getValue())));
        	
        	System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey().concat(":") .concat(String.valueOf(entry.getValue()))));
        }

	}

}
