package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MovieStarter {
	public static void main(String[] args) {
		
		   String movie1="Madagaja";
		   String movie2="Milana";
		   String movie3="Akash";
		   String movie4="Abhi";
		   String movie5="Bettada Huvu";
		   String movie6="Arasu";
		   String movie7="Rachsan";
		   String movie8="Kotigobba";
		   String movie9="Kotigobba 2";
		   String movie10="Kotigobba 3";
		   String movie11="Appu";
		   String movie12="Mourya";
		   String movie13="Vamshi";
		   String movie14="Lakshmi";
		   String movie15="Natasarabhouma";
		   String movie16="Jackie";
		   String movie17="Raj";
		   String movie18="Ram";
		   String movie19="Gaja";
		   String movie20="Navgarha";
		   String movie21="Hudugaru";
		   String movie22="Sakath";
		   String movie23="Circus";
		   String movie24="Bombat Car";
		   String movie25="Magic Ajji";
		   String movie26="Sangam";
		   String movie27="Mummy I Love You";
		   String movie28="Porki";
		   String movie29="Abay";
		   String movie30="Suryavamsha";
		   String movie31="Makkala Sainya";
		   String movie32="Yajamana";
		   String movie33="Diya";
		   String movie34="Ayogya";
		   String movie35="Bahadhur";
		   String movie36="KGF 1";
		   String movie37="KGF 2";
		   String movie38="Bhupati";
		   String movie39="Chappale";
		   String movie40="Rajakumara";
		   String movie41="Chakravyuha";
		   String movie42="Rana Vikram";
		   String movie43="Mytri";
		   String movie45="Power";
		   String movie46="Pruthvi";
		   String movie47="Anjaniputra";
		   String movie48="Bhagyavantha";
		   String movie49="Chalisuva Modagalu";
		   String movie50="Vasantha Geetha";
		   String movie51="Hudugaru";
		   String movie52="Sakath";
		   String movie53="Circus";
		   String movie54="Bombat Car";
		   String movie55="Magic Ajji";
		   String movie56="Sangam";
		   String movie57="Mummy I Love You";
		   String movie58="Porki";
		   String movie59="Abay";
		   String movie60="Suryavamsha";
		   
	       Collection collection=new ArrayList();
	       
	       collection.add(movie1);
	       collection.add(movie2);
	       collection.add(movie3);
	       collection.add(movie4);
	       collection.add(movie5);
	       collection.add(movie6);
	       collection.add(movie7);
	       collection.add(movie8);
	       collection.add(movie9);
	       collection.add(movie10);
	       collection.add(movie11);
	       collection.add(movie12);
	       collection.add(movie13);
	       collection.add(movie14);
	       collection.add(movie15);
	       collection.add(movie16);
	       collection.add(movie17);
	       collection.add(movie18);
	       collection.add(movie19);
	       collection.add(movie20);
	       collection.add(movie21);
	       collection.add(movie22);
	       collection.add(movie23);
	       collection.add(movie24);
	       collection.add(movie25);
	       collection.add(movie26);
	       collection.add(movie27);
	       collection.add(movie28);
	       collection.add(movie29);
	       collection.add(movie30);
	       collection.add(movie31);
	       collection.add(movie32);
	       collection.add(movie33);
	       collection.add(movie34);
	       collection.add(movie35);
	       collection.add(movie36);
	       collection.add(movie37);
	       collection.add(movie38);
	       collection.add(movie39);
	       collection.add(movie40);
	       collection.add(movie41);
	       collection.add(movie42);
	       collection.add(movie43);
	       collection.add(movie45);
	       collection.add(movie46);
	       collection.add(movie47);
	       collection.add(movie48);
	       collection.add(movie49);
	       collection.add(movie50);
	       collection.add(movie51);
	       collection.add(movie52);
	       collection.add(movie53);
	       collection.add(movie54);
	       collection.add(movie55);
	       collection.add(movie56);
	       collection.add(movie57);
	       collection.add(movie58);
	       collection.add(movie59);
	       collection.add(movie60);
	       
	       
	       System.out.println(collection.toString());
	       System.out.println("Number of Movie added :" + collection.size());
	       
	       Iterator<String> itr = collection.iterator();

			boolean check = itr.hasNext();
			System.out.println(check);

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

			boolean check1 = collection.remove(movie53);
			System.out.println(check1);

			boolean checkout = collection.contains(movie53);
			System.out.println(checkout);

			boolean contained = collection.isEmpty();
			System.out.println(contained);

			collection.clear();
			System.err.println("cleared");

			}
}
