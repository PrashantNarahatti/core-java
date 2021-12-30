package com.xworkz.drone;

import com.xworkz.drone.dao.IcecreamDAO;
import com.xworkz.drone.dto.IcecreamDTO;

public class IcecreamScammer {

	public static void main(String[] args) {
		IcecreamDTO icecreamDTO1 = new IcecreamDTO(1, "Vanilla", "Gadabad", 20);
		IcecreamDTO icecreamDTO2 = new IcecreamDTO(2, "Buttered", "talent", 30);
		IcecreamDTO icecreamDTO3 = new IcecreamDTO(3, "Chocolate", "Mint", 40);
		IcecreamDTO icecreamDTO4 = new IcecreamDTO(4, "Strawberry", "Halva", 50);

		IcecreamDAO icecreamDAO = new IcecreamDAO();
		// icecreamDAO.save(icecreamDTO1);
		// icecreamDAO.save(icecreamDTO2);
		// icecreamDAO.save(icecreamDTO3);
		// icecreamDAO.save(icecreamDTO4);

		// boolean delete=icecreamDAO.deleteById(3);
		// System.out.println(delete);

		// icecreamDAO.readOperationById(1);
		// icecreamDAO.displayAll();
		icecreamDAO.displayTotalRows();

	}

}
