package com.xworkz.bank.dao;

public class ArrayBankDAO implements BankDAO {
	private BankDTO[] dtos = new BankDTO[100];;
	private int counter;

	@Override
	public boolean save(BankDTO bankDTO) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public BankDTO findByName(String name) {
		System.out.println("invoked finding name");

		return null;
	}

	public void saveBank(BankDTO bankDTO, int i) {
		System.out.println("save bankDTO dto and int cost:".concat(bankDTO.getName()));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = bankDTO;
			System.out.println("save bankDTO dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot save the bankDTO :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBank(BankDTO bankDTOs1) {
		System.out.println("invoked saveBank ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = bankDTOs1;

		} else {
			System.out.println("Cannot saveAirPort the dtos :".concat(String.valueOf(this.counter)));
		}
	}

	@Override
	public void displayAllBankDetails() {
		System.out.println("invoked displayAllBankDetails ");
	}

}
