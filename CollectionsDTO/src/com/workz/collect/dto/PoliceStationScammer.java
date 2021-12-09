package com.workz.collect.dto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PoliceStationScammer {

	public static void main(String[] args) {
		
		PoliceStationDTO policeStationDTO1 =new PoliceStationDTO("Navanagr Police Station", "Navanagar", "Civil", 30);

		PoliceStationDTO policeStationDTO2 =new PoliceStationDTO("Jaynagar Police Station", "Jaynagar 4th block", "Traffic", 41);

		PoliceStationDTO policeStationDTO3 =new PoliceStationDTO("Shivaram Police Station ", "Bagalkote", "Civil", 25);

		PoliceStationDTO policeStationDTO4 =new PoliceStationDTO("Bagalkot Old police Station", "Valabaayi", "Criminal",50);

		

		Set<PoliceStationDTO> set=new HashSet<PoliceStationDTO>();
		set.add(policeStationDTO1);
		set.add(policeStationDTO2);
		set.add(policeStationDTO3);
		set.add(policeStationDTO4);
		
		
		Iterator<PoliceStationDTO> itr=set.iterator();
		while(itr.hasNext())
		{
			PoliceStationDTO type = itr.next();
			System.out.println(type);
			
		}
		
		}

	}


