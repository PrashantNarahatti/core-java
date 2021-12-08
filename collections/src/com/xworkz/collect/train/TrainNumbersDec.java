package com.xworkz.collect.train;

import java.util.Comparator;

public class TrainNumbersDec implements Comparator<Long> {
	@Override
	public int compare(Long o1, Long o2) {
		if (o1.equals(o2)) {
			System.out.println("two objects are equal");
			return 0;

		}
		if (o2 < o1) {
			System.out.println("o2 is lesser than o1");
			return -1;
		}
		if (o2 > o2) {
			System.out.println("o2 is greater than o1");
			return 2;
		}
		return 0;
	}

}
