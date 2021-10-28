package com.xworkz.fishTank;

public class Factory {
	private String name;
	private String product;
	private int noOfWorker;
	private float revenue;
	private String owner;
	
	public Factory() {
		System.out.println("invoked no args const");
	}
	
	public Factory(String name) {
		System.out.println("invoked String const");
		this.name=name;
		System.out.println(this.name);
	}
	
	public Factory(int noOfWorker) {
		
		
		System.out.println("invoked int const");
		this.noOfWorker=noOfWorker;
		System.out.println(this.noOfWorker);
	}

}
