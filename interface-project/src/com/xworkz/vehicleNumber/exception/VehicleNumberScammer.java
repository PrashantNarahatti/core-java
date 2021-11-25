package com.xworkz.vehicleNumber.exception;

import com.xwork.pan.StorageFullRunTimeException;
import com.xworkz.vehicleNumber.ValidVehicleRegisterException;
import com.xworkz.vehicleNumber.VehicleNumberOperator;

public class VehicleNumberScammer {
   public static void main(String[] args) throws ValidVehicleRegisterException,StorageFullRunTimeException,Exception {
	   VehicleNumberOperator vehicleNumberOperator = new VehicleNumberOperator();
	   vehicleNumberOperator.save("KA-29 EG 0468");
		
	

	}

}
