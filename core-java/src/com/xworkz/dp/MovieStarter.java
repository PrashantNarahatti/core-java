package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;

import com.xworkz.dto.MovieDTO;

public class MovieStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDTO movieDTOs1 = new MovieDTO("Kotigobba", "shiva karthik", "Sudeep", 100000, "Soorappa Babu");
		MovieDAO dao1 = new MovieDAO();
		dao1.create(movieDTOs1);

		dao1.create(new MovieDTO("Pailwaan", "S Krishna", "Sudeep", 50000, "Swapna Krishna"), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchMovieByName("Pailwaan");
		System.out.println(ref);

	}

}
