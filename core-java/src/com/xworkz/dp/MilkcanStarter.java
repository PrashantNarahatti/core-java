package com.xworkz.dp;

import com.xworkz.dp.dao.MilkcanDAO;
import com.xworkz.dto.MilkcanDTO;

public class MilkcanStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkcanDTO milkcanDTOs1 = new MilkcanDTO(98.0f, "Big", "white", 10.0f, "good");
		MilkcanDAO dao1 = new MilkcanDAO();
		dao1.create(milkcanDTOs1);

		dao1.create(new MilkcanDTO(95.0f, "Small", "Blue", 5.0f, "good"), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchMilkcanByColour("Blue");
		System.out.println(ref);

	}

}
