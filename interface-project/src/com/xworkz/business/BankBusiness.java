package com.xworkz.business;

import com.xworkz.bank.dao.BankDAO;
import com.xworkz.bank.dao.BankDTO;

public class BankBusiness {
	BankDAO dao;

	private BankDTO[] bankDTOs = new BankDTO[1000];
	private int octopus = 0;

	public void saveBank(BankDTO dto) {
		System.out.println(" save saveAirPort ");

		if (this.octopus < this.bankDTOs.length && this.octopus >= 0) {
			this.bankDTOs[this.octopus++] = dto;

		} else {
			System.out.println("Cannot save the bankDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public void findBankByName(BankDTO dto) {
		System.out.println("invoked findBankByName");
		System.out.println("dto passed");

		for (int note = 0; note < this.bankDTOs.length; note++) {
			BankDTO ref = this.bankDTOs[note];
			if (ref != null) {
				System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
				String temp = ref.getName();
				System.out.println(temp);
				if (dto.equals(dto)) {
					System.out.println("Cart name  found");

				}

			}
		}

	}

	public void displayBank() {
		System.out.println("invoked  displayBank ");
	}

}
