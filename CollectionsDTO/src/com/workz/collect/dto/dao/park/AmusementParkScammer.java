package com.workz.collect.dto.dao.park;

public class AmusementParkScammer {

	public static void main(String[] args) {
		AmusementParkDTO dtoCompare = new AmusementParkDTO("Wonderla", 1500, true, true);

		AmusementParkDAO dao = new AmusementParkDAO();

		AmusementParkDTO found = dao.find((dto1, dto2) -> {
			if (dto1.getName().equals(dto2.getName()) && dto1.getEntryFees() == dto2.getEntryFees()) {
				return dto1;
			}
			return null;
		}, dtoCompare);
		System.out.println(found);
	}

}
