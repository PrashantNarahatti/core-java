package com.xworkz.BikeStarter;

public class StudentStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String institute="SKSVMACET";
	    char[] array=institute.toCharArray();
	    System.out.println(array.length);
	    int len=institute.length();
	    System.out.println(len);
	    System.out.println(array[2]);
	    
	    char a=institute.charAt(5);
	    System.out.println(a);
	    
	    String partOfInstitute=institute.substring(4);
	    System.out.println(partOfInstitute);
	    partOfInstitute=partOfInstitute.replace('M', 'P');
	    System.out.println(partOfInstitute);
	}

}
