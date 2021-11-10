package com.xworkz.deepavali.police;

import com.xworkz.deepavali.Police;

public class TrafficPolice extends Police {
	
	public TrafficPolice() {
		super();
		System.out.println("invoked no arg of Traffic Police");
		System.out.println(super.name);
		System.out.println(super.designation);
		System.out.println(super.exp);
		System.out.println(super.noOfStars);
		System.out.println(super.dept);
	}

}
