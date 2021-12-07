package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BikesStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bikeName1 = "Royal Enfield Classic 350";
		String bikeName2 = "TVS Jupiter 125";
		String bikeName3 = "TVS Apache RTR 160 ";
		String bikeName4 = "Yamaha YZF R15 V3";
		String bikeName5 = "TVS Apache RTR 160 4V";
		String bikeName6 = "Yamaha MT 15";
		String bikeName7 = "TVS Sport";
		String bikeName8 = "Hero Splendor Plus";
		String bikeName9 = "TVS Jupiter ";
		String bikeName10 = "TVS XL100 ";
		String bikeName11 = "TVS Apache RTR 200 4V ";
		String bikeName12 = "TVS Apache RR 310 ";
		String bikeName13 = "TVS Scooty Pep Plus";
		String bikeName14 = "TVS Apache RTR 180";
		String bikeName15 = "TVS Star City Plus ";
		String bikeName16 = "TVS Scooty Zest";
		String bikeName17 = "TVS NTORQ 125";
		String bikeName18 = "TVS Radeon";
		String bikeName19 = "TVS iQube Electric";
		String bikeName20 = "TVS Raider";
		String bikeName21 = "Yamaha YZF R15 V3";
		String bikeName22 = "TVS Apache RTR 160";
		String bikeName23 = "Jawa 42";
		String bikeName24 = "Jawa Perak";
		String bikeName25 = "Jawa Perak";
		String bikeName26 = "Bajaj Pulsar 150";
		String bikeName27 = " Bajaj Pulsar NS200  ";
		String bikeName28 = " Bajaj Pulsar 250 ";
		String bikeName29 = "Bajaj Pulsar RS200";
		String bikeName30 = "Bajaj Pulsar 220 F";
		String bikeName31 = " Bajaj Pulsar 125 Neon";
		String bikeName32 = "Bajaj CT100";
		String bikeName33 = "Bajaj Pulsar 160";
		String bikeName34 = "Bajaj CT110";
		String bikeName35 = "Bajaj Dominar 120";
		String bikeName36 = "Bajaj Dominar 150";
		String bikeName37 = "Bajaj Dominar 200";
		String bikeName38 = "Bajaj Dominar 220 ";
		String bikeName39 = " KTM RC 200";
		String bikeName40 = "KTM 200 Duke";
		String bikeName41 = " KTM 150 Duke";
		String bikeName42 = " KTM 125 Duke";
		String bikeName43 = "KTM 200 Duke";
		String bikeName44 = "KTM RC 390";
		String bikeName45 = "KTM 390 Duke";
		String bikeName46 = "KTM 250 Duke";
		String bikeName47 = "pulsar 150 ";
		String bikeName48 = "pulsar 200";
		String bikeName49 = "pulsar 220";
		String bikeName50 = "pulsar 250";
		String bikeName51 = "pulsar 390";
		String bikeName52 = "pulsar 125";
		String bikeName53 = "pulsar 110";
		String bikeName54 = " TVS XL100 ";
		String bikeName55 = "TVS Apache RTR 200 4V";
		String bikeName56 = "Yamaha MT 15";
		String bikeName57 = "Jawa Cruiser";
		String bikeName58 = "Jawa Perak";
		String bikeName59 = "TVS iQube Electric";
		String bikeName60 = "Hero Splendor Plus ";

		Collection collection = new ArrayList();
		collection.add(bikeName1);
		collection.add(bikeName2);
		collection.add(bikeName3);
		collection.add(bikeName4);
		collection.add(bikeName5);
		collection.add(bikeName6);
		collection.add(bikeName7);
		collection.add(bikeName8);
		collection.add(bikeName9);
		collection.add(bikeName10);
		collection.add(bikeName11);
		collection.add(bikeName12);
		collection.add(bikeName13);
		collection.add(bikeName14);
		collection.add(bikeName15);
		collection.add(bikeName16);
		collection.add(bikeName17);
		collection.add(bikeName18);
		collection.add(bikeName19);
		collection.add(bikeName20);
		collection.add(bikeName21);
		collection.add(bikeName22);
		collection.add(bikeName23);
		collection.add(bikeName24);
		collection.add(bikeName25);
		collection.add(bikeName26);
		collection.add(bikeName27);
		collection.add(bikeName28);
		collection.add(bikeName29);
		collection.add(bikeName30);
		collection.add(bikeName31);
		collection.add(bikeName32);
		collection.add(bikeName33);
		collection.add(bikeName34);
		collection.add(bikeName35);
		collection.add(bikeName36);
		collection.add(bikeName37);
		collection.add(bikeName38);
		collection.add(bikeName39);
		collection.add(bikeName40);
		collection.add(bikeName41);
		collection.add(bikeName42);
		collection.add(bikeName43);
		collection.add(bikeName44);
		collection.add(bikeName45);
		collection.add(bikeName46);
		collection.add(bikeName47);
		collection.add(bikeName48);
		collection.add(bikeName49);
		collection.add(bikeName50);
		collection.add(bikeName51);
		collection.add(bikeName52);
		collection.add(bikeName53);
		collection.add(bikeName54);
		collection.add(bikeName55);
		collection.add(bikeName56);
		collection.add(bikeName57);
		collection.add(bikeName58);
		collection.add(bikeName59);
		collection.add(bikeName60);
		
		System.out.println(collection.toString());
		System.out.println("Number of Actor Name added :" + collection.size());
		
		Iterator<String> itr = collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		boolean check1 = collection.remove(bikeName50);
		System.out.println(check1);

		boolean checkout = collection.contains(bikeName50);
		System.out.println(checkout);

		boolean contained = collection.isEmpty();
		System.out.println(contained);

		collection.clear();
		System.err.println("cleared");
	}

}
