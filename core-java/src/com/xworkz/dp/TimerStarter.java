package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;
import com.xworkz.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerDTO timerDTOs1 = new TimerDTO(true, "10:03", true, false, "Leyden");
		TimerDAO dao1 = new TimerDAO();
		dao1.create(timerDTOs1);

		dao1.create(new TimerDTO(true, "10:33", false, true, "Trexee"), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchTimerByBrand("Trexee");
		System.out.println(ref);

	}

}
