package com.xworkz.fishTank;
import com.xworkz.fishTank.Factory;
public class SugarFactory extends Factory{
	
	
	public SugarFactory(String name) {
		super("steel");
	
		System.out.println("invoked no args const");
	
	}
	public SugarFactory(int noOfWorker) {
		super(1912);
		System.out.println("invoked int const");
	}
}

