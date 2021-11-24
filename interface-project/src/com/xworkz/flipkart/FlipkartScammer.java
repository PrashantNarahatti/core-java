package com.xworkz.flipkart;

import com.xworkz.flipkart.dao.ArrayFlipkartCartDAO;
import com.xworkz.flipkart.dao.CartDTO;

public class FlipkartScammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartDTO cartDTOs1 = new CartDTO("MI", "good", 18000.0f, 4);
		ArrayFlipkartCartDAO dto1 = new ArrayFlipkartCartDAO();
		dto1.saveCart(cartDTOs1);

		dto1.saveCart(new CartDTO("VIO", "bad", 10000.0f, 3), 3);

		CartDTO ref = dto1.findByName("MI");
		System.out.println(ref);

		ArrayFlipkartCartDAO arrayAmazonCartDAO = new ArrayFlipkartCartDAO();
		System.out.println(arrayAmazonCartDAO.save(cartDTOs1));
		System.out.println(arrayAmazonCartDAO.findByName("MI"));
		arrayAmazonCartDAO.displayAllCartDetails();

	}

}
