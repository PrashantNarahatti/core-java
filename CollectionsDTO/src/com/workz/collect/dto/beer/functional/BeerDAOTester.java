package com.workz.collect.dto.beer.functional;

public class BeerDAOTester {

	public static void main(String[] args) {
		BeerDAO beerDAO = new BeerDAO();

		boolean found = beerDAO.Find((arg1, arg2) -> {
			return arg1.equals(arg2);
		}, "OT");
		System.out.println(found);

		boolean found1 = beerDAO.Find((arg1, arg2) -> {
			return arg1.equalsIgnoreCase(arg2);
		}, "kinG FISher");
		System.out.println(found1);

		boolean found2 = beerDAO.Find((arg1, arg2) -> {
			return arg1.endsWith(arg2);
		}, "her");
		System.out.println(found2);

		boolean found3 = beerDAO.Find((arg1, arg2) -> {
			return arg1.startsWith(arg2);
		}, "King");
		System.out.println(found3);
	}
}
