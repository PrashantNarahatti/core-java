package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WalletDTO walletDTOs1 = new WalletDTO("Titan Black", "Leather", 5, 400.0f, true);
		WalletDAO dao1 = new WalletDAO();
		dao1.create(walletDTOs1);

		dao1.create(new WalletDTO("Allen Solly", "Leather", 5, 300.0f, true), 3);

		dao1.indexOccupied();

		boolean ref = dao1.matchWalletByCompanyName("Titan Black");
		System.out.println(ref);

	}

}
