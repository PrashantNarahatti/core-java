package com.workz.collect.dto.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.workz.collect.dto.PalaceDTO;

public class PalaceScammer {
	public static void main(String[] args)
	{	
		PalaceDTO palaceDTO1=new PalaceDTO("Mysore Palace","Mysore","9:00am","10:00pm",100);
		PalaceDTO palaceDTO2=new PalaceDTO("Gol Gumbaz","Bijapur","9:00am","10:00pm",200);
		PalaceDTO palaceDTO3=new PalaceDTO("Bangalore Palace","Bangalore","10:00am","10:00pm",300);
		PalaceDTO palaceDTO4=new PalaceDTO("Mahakuta","Badami","09:00am","09:00pm",400);
		PalaceDTO palaceDTO5=new PalaceDTO("Kavala","Dandeli","10:00am","10:00pm",500);
		PalaceDTO palaceDTO6=new PalaceDTO("Rnganathaswamy Temple","Srirangapatna","09:00am","08:00pm",200);
		PalaceDTO palaceDTO7=new PalaceDTO("Melakote","Yadavgiri","10:00am","10:00pm",100);
		PalaceDTO palaceDTO8=new PalaceDTO("Durga Temple","Aihole","09:00am","10:00pm",300);
		PalaceDTO palaceDTO9=new PalaceDTO("Nrasimha Jhira","Bidar","09:00am","10:00pm",200);
		PalaceDTO palaceDTO10=new PalaceDTO("Mallikarjuna Temple","Talakad","10:00am","10:00pm",100);

		List<PalaceDTO> list = new ArrayList<PalaceDTO>();
		list.add(palaceDTO1);
		list.add(palaceDTO2);
		list.add(palaceDTO3);
		list.add(palaceDTO4);
		list.add(palaceDTO5);
		list.add(palaceDTO6);
		list.add(palaceDTO7);
		list.add(palaceDTO8);
		list.add(palaceDTO9);
		list.add(palaceDTO10);
		
		boolean palaceDTO=list.remove(palaceDTO3);
		System.out.println(palaceDTO);
		
		boolean contain=list.contains(palaceDTO2);
		System.out.println(contain);
		
		//list.clear();
		//System.err.println("cleared");

		
		int size=list.size();
		System.out.println(size);
		

		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		Iterator<PalaceDTO> itr=list.iterator();
		while(itr.hasNext()) {
			PalaceDTO ele=itr.next();
			System.out.println(ele);
		}
	}
}

		
		