package com.xworkz.rules.bridge;

import com.xworkz.rules.bridge.hospital.Hospital;

public class HospitalScammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital=new Hospital();
		System.out.println(hospital.register());
		System.out.println(hospital.payAdvance());
		System.out.println(hospital.validInsurance());
		System.out.println(hospital.payBill());
		System.out.println(hospital.discount());
		


	}

}
