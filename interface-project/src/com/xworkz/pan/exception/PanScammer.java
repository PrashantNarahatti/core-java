package com.xworkz.pan.exception;

import com.xwork.pan.PanOperator;
import com.xwork.pan.StorageFullRunTimeException;
import com.xwork.pan.ValidPanException;


public class PanScammer {

	public static void main(String[] args)  throws ValidPanException, StorageFullRunTimeException {
		PanOperator panOperator = new PanOperator();
		panOperator.save("BFHPN7202Q");
		

	}

}
