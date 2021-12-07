package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WebSeriesScammer {
	public static void main(String[] args) {

		String webSeries1 = "Coyboy bebop";
		String webSeries2 = "Foundation";
		String webSeries3 = "Howkeye";
		String webSeries4 = "Lost in space";
		String webSeries5 = "Hicups and hookups";
		String webSeries6 = "Inside Edge";
		String webSeries7 = "Money Heist";
		String webSeries8 = "The wheel of time";
		String webSeries9 = "Star trek";
		String webSeries10 = "The special ops";
		String webSeries11 = "The agents are here";
		String webSeries12 = "Succession";
		String webSeries13 = "Little things";
		String webSeries14 = "House of secret";
		String webSeries15 = "Break point";
		String webSeries16 = "Titans";
		String webSeries17 = "Kotafactory";
		String webSeries18 = "Star wars vision";
		String webSeries19 = "Squid game";
		String webSeries20 = "The last man";
		String webSeries21 = "Mombay diaries";
		String webSeries22 = "The emperie season";
		String webSeries23 = "What if";
		String webSeries24 = "Feels like ishq";
		String webSeries25 = "Ted lasso";
		String webSeries26 = "Never have i ever";
		String webSeries27 = "ray";
		String webSeries28 = "Loki";
		String webSeries29 = "The family man";
		String webSeries30 = "Out of love";
		String webSeries31 = "the big day";
		String webSeries32 = "Ok computer";
		String webSeries33 = "The falcon and winter soldier";
		String webSeries34 = "Bombay begums";
		String webSeries35 = "The married women";
		String webSeries36 = "Tandav";
		String webSeries37 = "Wanda vision";
		String webSeries38 = "The witcher";
		String webSeries39 = "Mis Matched";
		String webSeries40 = "The dark materials";
		String webSeries41 = "The agents are here";
		String webSeries42 = "Succession";
		String webSeries43 = "Little things";
		String webSeries44 = "House of secret";
		String webSeries45 = "Break point";
		String webSeries46 = "Titans";
		String webSeries47 = "Kotafactory";
		String webSeries48 = "Star wars vision";
		String webSeries49 = "Squid game";
		String webSeries50 = "The last man";
		String webSeries51 = "Mombay diaries";
		String webSeries52 = "The emperie season";
		String webSeries53 = "What if";
		String webSeries54 = "Feels like ishq";
		String webSeries55 = "Ted lasso";
		String webSeries56 = "Never have i ever";
		String webSeries57 = "ray";
		String webSeries58 = "Loki";
		String webSeries59 = "The family man";
		String webSeries60 = "Out of love";

		Collection collection = new ArrayList();
		collection.add(webSeries1);
		collection.add(webSeries2);
		collection.add(webSeries3);
		collection.add(webSeries4);
		collection.add(webSeries5);
		collection.add(webSeries6);
		collection.add(webSeries7);
		collection.add(webSeries8);
		collection.add(webSeries9);
		collection.add(webSeries10);
		collection.add(webSeries11);
		collection.add(webSeries12);
		collection.add(webSeries13);
		collection.add(webSeries14);
		collection.add(webSeries15);
		collection.add(webSeries16);
		collection.add(webSeries17);
		collection.add(webSeries18);
		collection.add(webSeries19);
		collection.add(webSeries20);
		collection.add(webSeries21);
		collection.add(webSeries22);
		collection.add(webSeries23);
		collection.add(webSeries24);
		collection.add(webSeries25);
		collection.add(webSeries26);
		collection.add(webSeries27);
		collection.add(webSeries28);
		collection.add(webSeries29);
		collection.add(webSeries30);
		collection.add(webSeries31);
		collection.add(webSeries32);
		collection.add(webSeries33);
		collection.add(webSeries34);
		collection.add(webSeries35);
		collection.add(webSeries36);
		collection.add(webSeries37);
		collection.add(webSeries38);
		collection.add(webSeries39);
		collection.add(webSeries40);
		collection.add(webSeries41);
		collection.add(webSeries42);
		collection.add(webSeries43);
		collection.add(webSeries44);
		collection.add(webSeries45);
		collection.add(webSeries46);
		collection.add(webSeries47);
		collection.add(webSeries48);
		collection.add(webSeries49);
		collection.add(webSeries50);
		collection.add(webSeries51);
		collection.add(webSeries52);
		collection.add(webSeries53);
		collection.add(webSeries54);
		collection.add(webSeries55);
		collection.add(webSeries56);
		collection.add(webSeries57);
		collection.add(webSeries58);
		collection.add(webSeries59);
		collection.add(webSeries60);

		System.out.println(collection.toString());
		System.out.println("Number of Web Series added :" + collection.size());
		
		 Iterator<String> itr = collection.iterator();

			boolean check = itr.hasNext();
			System.out.println(check);

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			boolean check1 = collection.remove(webSeries47);
			System.out.println(check1);

			boolean checkout = collection.contains(webSeries47);
			System.out.println(checkout);

			boolean contained = collection.isEmpty();
			System.out.println(contained);

			collection.clear();
			System.err.println("cleared");


	}

}
