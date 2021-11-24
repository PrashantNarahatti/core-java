package com.xworkz.bank.dao;

public interface BankDAO {
	boolean save(BankDTO bankDTO);

	BankDTO findByName(String name);

	void displayAllBankDetails();

}
