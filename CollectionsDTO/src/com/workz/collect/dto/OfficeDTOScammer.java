package com.workz.collect.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OfficeDTOScammer {
	public static void main(String[] args) {

		OfficeDTO officeDTO1 = new OfficeDTO("DC office", "APMC Road Bagalkot", 67, true);

		OfficeDTO officeDTO2 = new OfficeDTO("Income-tax office", "Navanagar", 56, true);

		OfficeDTO officeDTO3 = new OfficeDTO("Taluk-office", "Bagalkot", 80, true);

		OfficeDTO officeDTO4 = new OfficeDTO("Post office", "Navanagar", 50, false);

		OfficeDTO officeDTO5 = new OfficeDTO("Sale-tax office", "Vidhyagiri", 60, true);

		Set<OfficeDTO> set = new HashSet<OfficeDTO>();
		set.add(officeDTO1);
		set.add(officeDTO2);
		set.add(officeDTO3);
		set.add(officeDTO4);
		set.add(officeDTO5);

		Iterator<OfficeDTO> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
