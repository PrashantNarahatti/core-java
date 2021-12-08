package com.xworkz.collect.train;

import java.util.Comparator;

public class TrainNumbers  implements Comparator<Long> {
	@Override
	public int compare(Long o1, Long o2) {
		if (o1.equals(o2)) {
			System.out.println("two objects are equal");
			return 0;

		}
		if (o1 < o2) {
			System.out.println("o1 is lesser than o2");
			return -1;
		}
		if (o1 > o2) {
			System.out.println("o1 is greater than o2");
			return 2;
		}
		return 0;
	}


}
