package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorDTO doctorDTOs1 = new DoctorDTO("Pacchu", "Orthopaedics", "Dhanush", 'M', 50000, 25);
		DoctorDAO dao1 = new DoctorDAO();
		dao1.create(doctorDTOs1);

		dao1.create(new DoctorDTO("Pranu", "General surgery", "KLE", 'M', 40000, 24), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchDoctorByName("Pacchu");
		System.out.println(ref);

	}

}
