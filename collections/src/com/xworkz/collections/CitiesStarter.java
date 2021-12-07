package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CitiesStarter {
	public static void main(String[] args) {

		String city1 = "Gangavati";
		String city2 = "Koppal";
		String city3 = "Gadag";
		String city4 = "Hubli";
		String city5 = "Gulbarga";
		String city6 = "Bellari";
		String city7 = "Raichur";
		String city8 = "Hospet";
		String city9 = "Bengalore";
		String city10 = "Mysore";
		String city11 = "Kolar";
		String city12 = "Dharwad";
		String city13 = "Tumkuru";
		String city14 = "Hassan";
		String city15 = "Shimogga";
		String city16 = "Karavar";
		String city17 = "Channapatna";
		String city18 = "Yadgiri";
		String city19 = "Madya";
		String city20 = "Maddura";
		String city21 = "Chikkamangaluru";
		String city22 = "Kodagu";
		String city23 = "Udapi";
		String city24 = "Ujari";
		String city25 = "coorg";
		String city26 = "Manipal";
		String city27 = "Goa";
		String city28 = "Mumbai";
		String city29 = "Kolkata";
		String city30 = "Chennai";
		String city31 = "Jaipur";
		String city32 = "Rajasthan";
		String city33 = "Vijayapur";
		String city34 = "Bengal";
		String city35 = "Ranchi";
		String city36 = "Delhi";
		String city37 = "Jammu Kashmir";
		String city38 = "Assam";
		String city39 = "Bihar";
		String city40 = "Oddisa";
		String city41 = "Kerala";
		String city42 = "Chitradurga";
		String city43 = "Bagalkote";
		String city44 = "Davangere";
		String city45 = "Belgaum";
		String city46 = "Bijapur";
		String city47 = "Soraba";
		String city48 = "Ranebennur";
		String city49 = "Harihara";
		String city50 = "Sirsi";
		String city51 = "Dharwad";
		String city52 = "Tumkuru";
		String city53= "Hassan";
		String city54 = "Shimogga";
		String city55 = "Karavar";
		String city56 = "Channapatna";
		String city57 = "Yadgiri";
		String city58 = "Madya";
		String city59 = "Maddura";
		String city60 = "Chikkamangaluru";

		Collection collection = new ArrayList();
		collection.add(city1);
		collection.add(city2);
		collection.add(city3);
		collection.add(city4);
		collection.add(city5);
		collection.add(city6);
		collection.add(city7);
		collection.add(city8);
		collection.add(city9);
		collection.add(city10);
		collection.add(city11);
		collection.add(city12);
		collection.add(city13);
		collection.add(city14);
		collection.add(city15);
		collection.add(city16);
		collection.add(city17);
		collection.add(city18);
		collection.add(city19);
		collection.add(city20);
		collection.add(city21);
		collection.add(city22);
		collection.add(city23);
		collection.add(city24);
		collection.add(city25);
		collection.add(city26);
		collection.add(city27);
		collection.add(city28);
		collection.add(city29);
		collection.add(city30);
		collection.add(city31);
		collection.add(city32);
		collection.add(city33);
		collection.add(city34);
		collection.add(city35);
		collection.add(city36);
		collection.add(city37);
		collection.add(city38);
		collection.add(city39);
		collection.add(city40);
		collection.add(city41);
		collection.add(city42);
		collection.add(city43);
		collection.add(city44);
		collection.add(city45);
		collection.add(city46);
		collection.add(city47);
		collection.add(city48);
		collection.add(city49);
		collection.add(city50);
		collection.add(city51);
		collection.add(city52);
		collection.add(city53);
		collection.add(city54);
		collection.add(city55);
		collection.add(city56);
		collection.add(city57);
		collection.add(city58);
		collection.add(city59);
		collection.add(city60);
		

		System.out.println(collection.toString());
		System.out.println("Number of Cities added :" + collection.size());
		
		Iterator<String> itr = collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		boolean check1 = collection.remove(city50);
		System.out.println(check1);

		boolean checkout = collection.contains(city50);
		System.out.println(checkout);

		boolean contained = collection.isEmpty();
		System.out.println(contained);

		collection.clear();
		System.err.println("cleared");
	}

}
