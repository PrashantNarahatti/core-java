package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SweetsScammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sweetName1 = "Arisa Pitha";
		String sweetName2 = "Apple Halwa";
		String sweetName3 = "Balushahi";
		String sweetName4 = "Boondi";
		String sweetName5 = "Ghevar";
		String sweetName6 = "Gajar ka halwa";
		String sweetName7 = "Gulab jamun";
		String sweetName8 = "Imarti";
		String sweetName9 = "Jalebi";
		String sweetName10 = "Kaju katli";
		String sweetName11 = "Kalakand";
		String sweetName12 = "Kheer";
		String sweetName13 = "Khirmohan";
		String sweetName14 = "Kulfi";
		String sweetName15 = "Laddu";
		String sweetName16 = "Lassi";
		String sweetName17 = "Motichoor laddu";
		String sweetName18 = "Malpua";
		String sweetName19 = "Nankhatai";
		String sweetName20 = "Petha";
		String sweetName21 = "Phirni";
		String sweetName22 = "Rabri";
		String sweetName23 = "Sheera";
		String sweetName24 = "Singori";
		String sweetName25 = "Sohan halwa";
		String sweetName26 = "Sohan papdi, pateesa";
		String sweetName27 = "Amriti";
		String sweetName28 = "Cham cham";
		String sweetName29 = "Chandrapuli";
		String sweetName30 = "Chhena gaja";
		String sweetName31 = "Chhena jalebi";
		String sweetName32 = "Chhena kheeri";
		String sweetName33 = "Chhena poda";
		String sweetName34 = "Chuda Ghasa";
		String sweetName35 = "Ledikeni";
		String sweetName36 = "Lyangcha";
		String sweetName37 = "Malapua";
		String sweetName38 = "Mihidana";
		String sweetName39 = "Pantua";
		String sweetName40 = "Bulgerian";
		String sweetName41 = "Pithe";
		String sweetName42 = "Rabri";
		String sweetName43 = "Rasabali";
		String sweetName44 = "Rasgulla";
		String sweetName45 = "Sandesh";
		String sweetName46 = "Ada";
		String sweetName47 = "Adhirasam";
		String sweetName48 = "Chikki";
		String sweetName49 = "Dharwad Pedha";
		String sweetName50 = "Double ka Meetha";
		String sweetName51 = "Phirni";
		String sweetName52 = "Rabri";
		String sweetName53 = "Sheera";
		String sweetName54 = "Singori";
		String sweetName55 = "Sohan halwa";
		String sweetName56 = "Sohan papdi, pateesa";
		String sweetName57 = "Amriti";
		String sweetName58 = "Cham cham";
		String sweetName59 = "Chandrapuli";
		String sweetName60 = "Chhena gaja";

		Collection collection = new ArrayList();
		collection.add(sweetName1);
		collection.add(sweetName2);
		collection.add(sweetName3);
		collection.add(sweetName4);
		collection.add(sweetName5);
		collection.add(sweetName6);
		collection.add(sweetName7);
		collection.add(sweetName8);
		collection.add(sweetName9);
		collection.add(sweetName10);
		collection.add(sweetName11);
		collection.add(sweetName12);
		collection.add(sweetName13);
		collection.add(sweetName14);
		collection.add(sweetName15);
		collection.add(sweetName16);
		collection.add(sweetName17);
		collection.add(sweetName18);
		collection.add(sweetName19);
		collection.add(sweetName20);
		collection.add(sweetName21);
		collection.add(sweetName22);
		collection.add(sweetName23);
		collection.add(sweetName24);
		collection.add(sweetName25);
		collection.add(sweetName26);
		collection.add(sweetName27);
		collection.add(sweetName28);
		collection.add(sweetName29);
		collection.add(sweetName30);
		collection.add(sweetName31);
		collection.add(sweetName32);
		collection.add(sweetName33);
		collection.add(sweetName34);
		collection.add(sweetName35);
		collection.add(sweetName36);
		collection.add(sweetName37);
		collection.add(sweetName38);
		collection.add(sweetName39);
		collection.add(sweetName40);
		collection.add(sweetName41);
		collection.add(sweetName42);
		collection.add(sweetName43);
		collection.add(sweetName44);
		collection.add(sweetName45);
		collection.add(sweetName46);
		collection.add(sweetName47);
		collection.add(sweetName48);
		collection.add(sweetName49);
		collection.add(sweetName50);
		collection.add(sweetName51);
		collection.add(sweetName52);
		collection.add(sweetName53);
		collection.add(sweetName54);
		collection.add(sweetName55);
		collection.add(sweetName56);
		collection.add(sweetName57);
		collection.add(sweetName58);
		collection.add(sweetName59);
		collection.add(sweetName60);


		System.out.println(collection.toString());
		System.out.println("Number of Lang Name added :" + collection.size());
		
		 Iterator<String> itr = collection.iterator();

			boolean check = itr.hasNext();
			System.out.println(check);

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			boolean check1 = collection.remove(sweetName30);
			System.out.println(check1);

			boolean checkout = collection.contains(sweetName30);
			System.out.println(checkout);

			boolean contained = collection.isEmpty();
			System.out.println(contained);

			collection.clear();
			System.err.println("cleared");	
			}

}
