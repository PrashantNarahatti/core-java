package com.xworkz.dp.dao;

import com.xworkz.dto.WalletDTO;
import com.xworkz.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] walletDTOs = new WalletDTO[100];
	private int counter = 0;

	public void create(WalletDTO dto) {
		System.out.println("create walletDTOs cost");

		if (this.counter < this.walletDTOs.length && this.counter >= 0) {
			this.walletDTOs[this.counter++] = dto;

		} else {
			System.out.println("Cannot create the walletDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public void create(WalletDTO dto, int index) {
		System.out.println("create walletDTOs dto and int cost:".concat(dto.getCompanyName()));
		if (index >= 0 && this.counter < this.walletDTOs.length && this.counter >= 0 && dto != null) {
			this.walletDTOs[this.counter++] = dto;
			System.out.println("create walletDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the walletDTOs :".concat(String.valueOf(this.counter)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied:".concat(String.valueOf(counter)));
		return counter;
	}

	public boolean matchWalletByCompanyName(String companyName) {
		System.out.println("invoked matchWalletByName");
		System.out.println("company name passed: ".concat(companyName));

		for (int kama = 0; kama < this.walletDTOs.length; kama++) {
			WalletDTO ref = this.walletDTOs[kama];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(kama)));
				String tempName = ref.getCompanyName();
				System.out.println("matching: ".concat(tempName));
				if (companyName.equals(tempName)) {
					System.out.println("company name found");
					return true;
				}

			}
		}
		return false;
	}

}
