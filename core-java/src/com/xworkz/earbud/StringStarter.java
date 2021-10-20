package com.xworkz.earbud;

public class StringStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String noise="noise";
		String boat=new String("boat");
		if(noise==boat)
		{
			System.out.println("String are pointing to same memory");
		}
		else {
			System.out.println("String are pointing to different memory");
		}
		String boat1="boat";
		if(boat==boat1) {
			System.out.println("String are pointing to same memory");
			
		}
		else
		{
			System.out.println("String are pointing to different memory");
		}
		boat1="Cherry";
		System.out.println(boat1);
		
		boat1="Masala papad";
		System.out.println(boat1);
		
		boat1=boat;
		System.out.println(boat1);
		
		if(boat1==boat)
		{
			System.out.println("boat and boat1 pointing to same memory");
		}
		else
		{
			System.out.println("boat and boat1 pointing to different memory");	
		}
	}

}
