package com.xworkz.fishTank;
import com.xworkz.fishTank.Fish;
public class SharkFish extends Fish {
	public float height=2.0f;
	public float weight=10.0f;
	
	public SharkFish() {
		super();
		System.out.println("invoked SharkFish no args const");
	}
	
	public SharkFish(float height) {
		System.out.println("invoked SharkFish float const");
	}

}
