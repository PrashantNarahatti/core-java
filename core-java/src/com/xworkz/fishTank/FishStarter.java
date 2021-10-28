package com.xworkz.fishTank;
import com.xworkz.fishTank.Fish;
import com.xworkz.fishTank.SharkFish;
import com.xworkz.fishTank.GoldFish;

public class FishStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharkFish sharkFish=new SharkFish();
		System.out.println(sharkFish.height);
		System.out.println(sharkFish.weight);
		
		Fish fish=new SharkFish();
		System.out.println(fish.region);
		System.out.println(fish.alive);
		
		GoldFish goldFish=new GoldFish();
		System.out.println(goldFish.colour);
		System.out.println(goldFish.size);
		
	

	}

}
