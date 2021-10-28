package com.xworkz.crudOperation;

public class BeachOperator {
	
	   private String country=new String();
	   private String[] beachNames=new String[5];
	   private int counter=0;
	   
	   public BeachOperator()
	   {
		   this("INDIA");
		   System.out.println("invoked no-arg const");
		   
	   }
	   public BeachOperator(String country)
	   {
		   this.country=country;
		   System.out.println("invoked String const");
		   
	   }
	   public String getCountry()
	   {
		   return country;
	   }
	   public void addBeachName(String name) {
	    System.out.println("invoked addBeachName");
		   System.out.println("Name arg :". concat(name));
		   if(this.counter<5) {
			   this.beachNames[this.counter]=name;
			   this.counter++;
		   }
		   else {
			   System.out.println("array is full");
		   }
}
public void displayBeachNames() {
	System.out.println("invoked displayBeachNames");
	for(int chakli=0;chakli<this.beachNames.length;chakli++)
	{
		String name=this.beachNames[chakli];
		System.out.println(name);	   
	   

	}

}
}
