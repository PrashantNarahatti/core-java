package com.xworkz.core;

public class WrapperStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Xwork";
		boolean contain=name.contains("no");
		System.out.println("contains wo"+contain);
		
		char[] chars= {'X','W','O','R','K','Z'};
		String convertedString=String.copyValueOf(chars);
		System.out.println(convertedString);
		
		String branch=new String("BTM");
		boolean containsTM=branch.contains("TM");
		System.out.println(branch.contains("TM"));
		
		String place="BGK";
		String famousFor="Durga Temple";
		String bgkFamousFor=place.concat(famousFor);
		System.out.println(bgkFamousFor);
		
		String nagappa="Nagappa";
		String nagamma=new String("Nagamma");
		boolean same=nagappa.equals(nagamma);
		System.out.println("SAME"+same);
		
		String size=new String("PHONE");
		boolean matchesONE=size.matches("ONE");
		System.out.println(size.matches("ONe"));
		
		String gender=new String("Male");
		boolean contentEquals1=gender.contentEquals("Male");
		System.out.println(contentEquals1);
		
		String festival="Hihappy Dasara";
		String substring=festival.substring(3);
		System.out.println(substring);
		
		String CorrectOrder="xworkz offline BTM";
		String replace=CorrectOrder.replace('r', 'a');
		System.out.println(replace);
		
		String mobile="MI";
		boolean endsWith=mobile.endsWith("MI");
		System.out.println(endsWith);
		
		String marketname="One Mart";
		String sub=marketname.substring(0,3);
		System.out.println(sub);
		
		String city="BgK";
		String toLowerCase=city.toLowerCase();
		System.out.println(toLowerCase);
		
		String city1="GadaG";
		String toUpperCase1=city1.toUpperCase();
		System.out.println(toUpperCase1);
		
		String addres=" Bangalore is the capital of Karnatak";
		int length=addres.length();
		System.out.println(length);
		
		String game="pupg";
		String concat=game.concat(" pro");
		System.out.println(concat);
		
		String amazon=" ";//true
		String amazon1=" online shoping site";//false
		boolean isEmpty=amazon.isEmpty();
		System.out.println(isEmpty);
		
		String cartoon="tomjerry";
		String [] sp=cartoon.split(cartoon);
		System.out.println("  split"+sp);
		
		String bookexites="true";
		String valueOf=bookexites.valueOf("true");
		System.out.println(valueOf);
		
		
		
	}
}
