package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircusDTO circusDTOs1 = new CircusDTO("Pacchu", 50, 10, 5, "2hr");
		CircusDAO dao1 = new CircusDAO();
		dao1.create(circusDTOs1);

		dao1.create(new CircusDTO("Pranu", 60, 15, 5, "2hr"), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchCircusByOwner("Pranu");
		System.out.println(ref);

	}

}
