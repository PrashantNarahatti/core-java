package com.xworkz.hajama;
import com.xworkz.hajama.Saloon;
import com.xworkz.hajama.NaturalSaloon;
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
		
		Saloon saloon=new NaturalSaloon();
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajamas);
		
	}

}
