package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PgNameMapScammer {

	public static void main(String[] args) {
		Map<String,Integer> nameAndTotalMembers = new HashMap<String,Integer>();
		nameAndTotalMembers.put("Vinayak",100);
		nameAndTotalMembers.put("Sai",50);
		nameAndTotalMembers.put("Karthik",80);
		nameAndTotalMembers.put("Ram",75);
		nameAndTotalMembers.put("Venkateshwar",45);

		Set<String> set=nameAndTotalMembers.keySet();
        set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Collection<Integer> collection=nameAndTotalMembers.values();
        collection.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Set<Map.Entry<String, Integer>> entryset=nameAndTotalMembers.entrySet();
        Iterator<Map.Entry<String,Integer>> itr=entryset.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<String,Integer> element =itr.next();
        	System.out.println(element.getKey()+ " ".concat("contains")+" ".concat(element.getValue()+" ".concat("members")));
        	
        	System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey() . concat(":") + " " .concat(String.valueOf(entry.getValue()))));
        }
        
	}

}

	
