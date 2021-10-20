package com.xworkz.earbud;

public class CoffeeeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String institute="Xworkz";
    char[] array=institute.toCharArray();
    System.out.println(array.length);
    int len=institute.length();
    System.out.println(len);
    System.out.println(array[2]);
    
    char a=institute.charAt(5);
    System.out.println(a);
    
    String partOfInstitute=institute.substring(4);
    System.out.println(partOfInstitute);
    partOfInstitute=partOfInstitute.replace('k', 'T');
    System.out.println(partOfInstitute);
	}

}
