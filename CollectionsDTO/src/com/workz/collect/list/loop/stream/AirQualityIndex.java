package com.workz.collect.list.loop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex {

	public static void main(String[] args) {
		Integer good = 50;
		Integer moderate = 100;
		Integer unhealthy = 150;
		Integer veryUnhealthy = 200;
		Integer Hazardious = 300;

		Stream<Integer> air = Stream.of(50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800,
				850, 900, 950, 1000);

		List<Integer> temp = air.filter((e) -> e > 100).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println("air quality index :" + e));
		System.err.println("============");
		System.err.println("ascending order");

		Stream<Integer> air1 = Stream.of(50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800,
				850, 900, 950, 1000);

		List<Integer> temp2 = air1.filter((e) -> e > 100).sorted().collect(Collectors.toList());
		temp2.forEach((e) -> System.out.println("air quality index :" + e));
		System.err.println("============");
		System.err.println("descending order");

		Stream<Integer> air2 = Stream.of(50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800,
				850, 900, 950, 1000);

		List<Integer> temp1 = air2.sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println("air quality index :" + e));

	}

}
