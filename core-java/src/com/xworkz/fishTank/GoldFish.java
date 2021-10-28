package com.xworkz.fishTank;
import com.xworkz.fishTank.Fish;
public class GoldFish extends Fish {
	public String colour="Gold";
	public String size="small";
	public GoldFish() {
		super();
		
		System.out.println("invoked GoldFish no args const");
	}
	public GoldFish(String colour,String size) {
		System.out.println("invoked GlodFish String const");
	}

}
