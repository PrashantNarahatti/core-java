package com.workz.collect.dto.beer.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeerDAO {
	private Collection<String> beerCollections = new ArrayList<String>();

	public BeerDAO() {
		this.beerCollections.add("King Fisher");
		this.beerCollections.add("Tuborg");
		this.beerCollections.add("Heineken");
		this.beerCollections.add("Budweiser");
		this.beerCollections.add("Tiger Beer");
	}

	public boolean Find(StringMatch search,String value)
	{
		Iterator<String> itr=beerCollections.iterator();
		 while(itr.hasNext())
		 {
		String element=itr.next();
		if(search.evaluate(element,value))
		{
			return true;
		}


		 }
		return false;
	  }
   }