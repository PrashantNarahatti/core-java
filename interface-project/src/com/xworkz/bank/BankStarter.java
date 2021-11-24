package com.xworkz.bank;

import com.xworkz.bank.dao.ArrayBankDAO;
import com.xworkz.bank.dao.BankDTO;

public class BankStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDTO bankDTOs1 = new BankDTO(1049368, "SBI", "IDIB000B139", "Bagalkot");
		ArrayBankDAO dto1 = new ArrayBankDAO();
		dto1.save(bankDTOs1);

		dto1.saveBank(new BankDTO(102545, "Karnataka", "IDIK013K107", "Hubli"), 3);

		BankDTO ref = dto1.findByName("SBI");
		System.out.println(ref);

		ArrayBankDAO arrayBankDAO = new ArrayBankDAO();
		System.out.println(arrayBankDAO.save(bankDTOs1));
		System.out.println(arrayBankDAO.findByName("SBI"));
		arrayBankDAO.displayAllBankDetails();

	}

}
