package com.xworkz.drone;

import com.xworkz.drone.dao.TrainDAO;
import com.xworkz.drone.dto.TrainDTO;

public class TrainScammer {
	public static void main(String[] args) {

		TrainDTO trainDTO1 = new TrainDTO(1,16535, "IRCTC", "Bagalkot",3,250, "sleeper", "Golgumbaz Express");
		TrainDTO trainDTO2 = new TrainDTO(2,18006, "RAC", "Koppal", 12, 125, "Non-sleeper", "Hampi Express");
		TrainDTO trainDTO3 = new TrainDTO(3,10863, "PNR", "Hubli",6, 100, "General", "Solapur Express");
		TrainDTO trainDTO4 = new TrainDTO(4,99026, "IRC", "Gadag", 7, 80, "AC", "Mysore Express");
		
		TrainDAO trainDAO = new TrainDAO();
		 //trainDAO.save(trainDTO1);
		 //trainDAO.save(trainDTO2);
		 //trainDAO.save(trainDTO3);
		 //trainDAO.save(trainDTO4);
		
		 //boolean delete=trainDAO.deleteByTrainNo(10863);
		// System.out.println(delete);
		 
		//trainDAO.displayById(2);
		
		//boolean del=trainDAO.deleteByTrainNoAndT_id(10863, 3);
		//System.out.println(del);
		
		//trainDAO.getByTrainNo(10863);
		
		//boolean up=trainDAO.updateDestinationByTrainNo("Laxmeshwar", 16535);
		//System.out.println(up);
		
		//boolean update=trainDAO.updateDestinationAndBoardingByTrainNo("Haveri", "IRCTC", 16535);
		//System.out.println(update);
		
		//trainDAO.getAll();
		 
		 //trainDAO.getAllByBoarding("PNR");
		 
		// trainDAO.getAllByDestination("Gangavati");
		
		//trainDAO.getTotal();
		//trainDAO.getMaxPrice();
		trainDAO.getMinPrice();
		
		
	}
}
