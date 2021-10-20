package com.xworkz.wrapperclasses;

public class BooleanStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Boolean book=true;
		Boolean bag=false;
		System.out.println(book.compareTo(book));
		System.out.println(book.compare(book,bag));
		System.out.println(book.equals(book));
		System.out.println(book.logicalAnd(book,bag));
		System.out.println(book.valueOf(bag));
		
		
		
		//Byte
		Byte mi=3;
		Byte moto=6;
		System.out.println(mi.compareTo(mi));
		System.out.println(moto.compareTo(moto));
		System.out.println(mi.compare(mi,moto));
		System.out.println(moto.equals(moto));
		System.out.println(moto.valueOf(moto));
		
		//Short
		Short bikeNo=92;
		Short carNo=9275;
		System.out.println(bikeNo.compareTo(bikeNo));
		System.out.println(bikeNo.equals(bikeNo));
		System.out.println(carNo.valueOf(carNo));
		System.out.println(bikeNo.hashCode(bikeNo));
		System.out.println(carNo.toUnsignedInt(carNo));
		
		//Double
		Double carPrice=700000.0d;
		Double phonePrice=20000.0d;
		System.out.println(carPrice.compareTo(carPrice));
		System.out.println(carPrice.compare(phonePrice,carPrice));
		System.out.println(carPrice.equals(carPrice));
		System.out.println(phonePrice.hashCode(phonePrice));
		System.out.println(phonePrice.max(phonePrice,carPrice));
		
	
	}

}
