package com.xworkz.access.holiday;

public class Festival {
	
	public static boolean holiday;
	String name;
	private int count=0;
	
	public Festival()
	{
		System.out.println("Invoked no-arg Const of festival");
		
		}
        public void celebration(String name)
        {
        	System.out.println("ivoked celebration+name");
        	
        }
        public static void enjoy()
        {
        	System.out.println("enjoy()");
        }
}
