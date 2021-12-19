package com.workz.collect.dto.dao.park;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AmusementParkDAO {

	private List<AmusementParkDTO> list = new ArrayList<AmusementParkDTO>();

	public AmusementParkDAO() {
		AmusementParkDTO parkDTO1 = new AmusementParkDTO("Wonderla", 1500, true, true);
		AmusementParkDTO parkDTO2 = new AmusementParkDTO("Fun world", 1500, false, true);
		AmusementParkDTO parkDTO3 = new AmusementParkDTO("GRS", 1500, false, true);
		AmusementParkDTO parkDTO4 = new AmusementParkDTO("Thunder", 1500, true, false);

		this.list.add(parkDTO1);
		this.list.add(parkDTO2);
		this.list.add(parkDTO3);
		this.list.add(parkDTO4);

	}

	public AmusementParkDTO find(AmusementPark match, AmusementParkDTO dtoCompare) {
		Iterator<AmusementParkDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			AmusementParkDTO element = itr.next();
			// System.out.println(element);
			AmusementParkDTO temp = match.evaluate(element, dtoCompare);
			if (temp != null) {
				return element;
			}

		}
		return null;

	}

}
