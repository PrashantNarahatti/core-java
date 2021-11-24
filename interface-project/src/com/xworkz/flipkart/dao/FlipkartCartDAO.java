package com.xworkz.flipkart.dao;

public interface FlipkartCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String name);

	void displayAllCartDetails();

}
