package com.xworkz.BikeStarter;

public class SchoolStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String school=new String("S.B.Patil");
		school=school.toUpperCase();
	    System.out.println(school);
	    String bus=school.toLowerCase();
	    System.out.println(school);
	    System.out.println(bus);
	    
	    String school1=new String("S.B.Patil");
	    school1.toUpperCase();
	    System.out.println(school1);
	    if(school==school1)
	    {
	    	System.out.println("both school and school1 pointing to same memory");   
	    }
	    else
	    {
	    	System.out.println("both school and school1 pointing to different memory"); 	
	    }
	    
	    String busNo="KA-29 SS365";
	    String instanceBusNo=new String("KA-29 SS365");
	    if(busNo==instanceBusNo)
	    {
	    	System.out.println("both busNo and instanceBusNo pointing to same memory"); 
	    }
	    else
	    {
	    	System.out.println("both busNo and instanceBusNo  pointing to different memory"); 
	    }
	    busNo="75";
	    boolean equal=busNo.equals(null);
	    System.out.println("both content is "+equal); 
	    
	    busNo=null;
	   
	}

}
