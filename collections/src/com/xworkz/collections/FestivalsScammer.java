package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FestivalsScammer {

	public static void main(String[] args) {
		String festival1 = "Holi";
		String festival2 = "Dasara";
		String festival3 = "Deepavali";
		String festival4 = "Ugadi";
		String festival5 = "Christmas";
		String festival6 = "New Year";
		String festival7 = "Sankranti";
		String festival8 = "Raksha Bandana";
		String festival9 = "Gowri Habba";
		String festival10 = "Durga Pooja";
		String festival11 = "Shivaratri";
		String festival12 = "Naraka Chaturdarshi";
		String festival13 = "Onam";
		String festival14 = "Ganesh Habba";
		String festival15 = "Navratri";
		String festival16 = "Baisakhi";
		String festival17 = "Gurpurab";
		String festival18 = "Easter";
		String festival19 = "Hemis";
		String festival20 = "Gangaur";
		String festival21 = "Hornbill";
		String festival22 = "Eid al-Adha";
		String festival23 = "Republic Day";
		String festival24 = "Durga Ashtami";
		String festival25 = "Rama NAVAMI";
		String festival26 = "kali Puje";
		String festival27 = "Bihu";
		String festival28 = "Mahavir Jayanti";
		String festival29 = "Ambedkar Jayanti";
		String festival30 = "Hanuman Jayanti";
		String festival31 = "Karthika Deepam";
		String festival32 = "Chhatrapati Shivaji Jayanti";
		String festival33 = "Republic Day";
		String festival34 = "Bddha Jayanti";
		String festival35 = "Gandhi Jayanti";
		String festival36 = "kanaka Jayanti";
		String festival37 = "Basava Jayanti";
		String festival38 = "Lohri";
		String festival39 = "Independence Day";
		String festival40 = "Rath Yatra";
		String festival41 = "Ramzan";
		String festival42 = "Kumbhmela";
		String festival43 = "Nagara Panchami";
		String festival44 = "Bhishma Ekadasi";
		String festival45 = "Losar";
		String festival46 = "Bakari";
		String festival47 = "Easter";
		String festival48 = "Moharam";
		String festival49 = "Karnataka Rajyostava";
		String festival50 = "ella Amavase";
		String festival51 = "Khar Hunnime";
		String festival52 = "Bhimana Amavase";
		String festival53 = "Children's Day";
		String festival54 = "Teacher's Day";
		String festival55 = "Bihu";
		String festival56 = "Karva Chauth";
		String festival57 = "Good Fridsay";
		String festival58 = "Pongal";
		String festival59 = "Bhaidooj";
		String festival60 = "Varmahalaxmi";

		Collection collection = new ArrayList();
		collection.add(festival1);
		collection.add(festival2);
		collection.add(festival3);
		collection.add(festival4);
		collection.add(festival5);
		collection.add(festival6);
		collection.add(festival7);
		collection.add(festival8);
		collection.add(festival9);
		collection.add(festival10);
		collection.add(festival11);
		collection.add(festival12);
		collection.add(festival13);
		collection.add(festival14);
		collection.add(festival15);
		collection.add(festival16);
		collection.add(festival17);
		collection.add(festival18);
		collection.add(festival19);
		collection.add(festival20);
		collection.add(festival21);
		collection.add(festival22);
		collection.add(festival23);
		collection.add(festival24);
		collection.add(festival25);
		collection.add(festival26);
		collection.add(festival27);
		collection.add(festival28);
		collection.add(festival29);
		collection.add(festival30);
		collection.add(festival31);
		collection.add(festival32);
		collection.add(festival33);
		collection.add(festival34);
		collection.add(festival35);
		collection.add(festival36);
		collection.add(festival37);
		collection.add(festival38);
		collection.add(festival39);
		collection.add(festival40);
		collection.add(festival41);
		collection.add(festival42);
		collection.add(festival43);
		collection.add(festival44);
		collection.add(festival45);
		collection.add(festival46);
		collection.add(festival47);
		collection.add(festival48);
		collection.add(festival49);
		collection.add(festival50);
		collection.add(festival51);
		collection.add(festival52);
		collection.add(festival53);
		collection.add(festival54);
		collection.add(festival55);
		collection.add(festival56);
		collection.add(festival57);
		collection.add(festival58);
		collection.add(festival59);
		collection.add(festival60);
		
		
		System.out.println(collection.size());
		
		Iterator<String> itr = collection.iterator();

		boolean check = itr.hasNext();
		System.out.println(check);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		boolean check1 = collection.remove(festival30);
		System.out.println(check1);

		boolean checkout = collection.contains(festival30);
		System.out.println(checkout);

		boolean contained = collection.isEmpty();
		System.out.println(contained);

		collection.clear();
		System.err.println("cleared");
	}

}
