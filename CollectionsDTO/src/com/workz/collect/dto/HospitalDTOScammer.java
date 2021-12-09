package com.workz.collect.dto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HospitalDTOScammer {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO1 = new HospitalDTO("Government Hospital", "Government", "Gadag", 30, 41);

		HospitalDTO hospitalDTO2 = new HospitalDTO("Apollo Hospital", "Private", "Jaynagar", 40, 55);

		HospitalDTO hospitalDTO3 = new HospitalDTO("Unity Hospital", "Private", "Bagalkot", 50, 64);

		HospitalDTO hospitalDTO4 = new HospitalDTO("Government Hospital", "Government", "Indira Nagar", 20, 45);

		Set<HospitalDTO> set = new HashSet<HospitalDTO>();
		set.add(hospitalDTO1);
		set.add(hospitalDTO2);
		set.add(hospitalDTO3);
		set.add(hospitalDTO4);

		Iterator<HospitalDTO> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
