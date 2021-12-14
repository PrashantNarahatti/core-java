package com.workz.collect.dto;

public class ClothBrandsDAOScammer {

	public static void main(String[] args) {

		ClothBrandsDAO dao = new ClothBrandsDAO();
		dao.save("Uniqlo");
		dao.save("Under Armour");
		dao.save("Patagonia");
		dao.save("Everlane");
		dao.save("Nike");

		boolean findMatchName = dao.findMatchName("Uniqlo");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("Patagonia");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("ev");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("ne");
		System.out.println(findMatchEndswith);

	}

}
