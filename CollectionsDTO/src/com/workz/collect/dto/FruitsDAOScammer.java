package com.workz.collect.dto;

public class FruitsDAOScammer {

	public static void main(String[] args) {

		FruitsDAO dao = new FruitsDAO();
		dao.save("Apple");
		dao.save("Banana");
		dao.save("Orange");
		dao.save("Mango");
		dao.save("Papaya");

		boolean findMatchName = dao.findMatchName("Apple");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("Orange");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("ma");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("ya");
		System.out.println(findMatchEndswith);

	}

}
