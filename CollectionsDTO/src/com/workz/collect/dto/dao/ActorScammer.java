package com.workz.collect.dto.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.workz.collect.dto.Actor;



public class ActorScammer {

	public static void main(String[] args) {
		Actor actor1 = new Actor("Puneeth Raj Kumar","Kannada",49,true,'m');
		Actor actor2 = new Actor("Kiccha Sudeep","Kannada",49,true,'m');
		Actor actor3 = new Actor("Shiva Raj Kumar","Kannada",54,true,'m');
		Actor actor4 = new Actor("Yogi","Kannada",38,true,'m');
		Actor actor5 = new Actor("Darshan","Kannada",48,true,'m');
		Actor actor6 = new Actor("Ramya","Kannada",38,false,'f');
		Actor actor7 = new Actor("Rakshita","Kannada",34,false,'f');
		Actor actor8 = new Actor("Upendra","Kannada",47,true,'m');
		Actor actor9 = new Actor("Ganesh","Kannada",42,true,'m');
		Actor actor10 = new Actor("Jaggesh","Kannada",48,true,'m');
	
		

		List<Actor> list = new ArrayList<Actor>();
		list.add(actor1);
		list.add(actor2);
		list.add(actor3);
		list.add(actor4);
		list.add(actor5);
		list.add(actor6);
		list.add(actor7);
		list.add(actor8);
		list.add(actor9);
		list.add(actor10);

		boolean actor = list.remove(actor4);
		System.out.println(actor);

		boolean contain = list.contains(actor3);
		System.out.println(contain);

		// list.clear();
		// System.err.println("cleared");

		int size = list.size();
		System.out.println(size);

		boolean empty = list.isEmpty();
		System.out.println(empty);

		Iterator<Actor> itr = list.iterator();
		while (itr.hasNext()) {
			Actor ele = itr.next();
			System.out.println(ele);
		}
	}

}
