package com.workz.collect.list.loop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satellite {

	public static void main(String[] args) {
		Stream<String> satellite = Stream.of("Erupa", "Ganymede", "Callislo", "Mimas", "Tethya", "Dione", "Rhea",
				"Tiian", "Lapectus", "Payload", "Bhaskara-2", "INSAT-1A", "SROSS-1", "INSAT-1D", "IRS-1B", "INSAT-2DT",
				"INSAT-2A", "INSAT-2B", "IRS-1E", "IRS-P2");

		System.err.println("ascending order");

		Stream<String> satellite1 = Stream.of("Erupa", "Ganymede", "Callislo", "Mimas", "Tethya", "Dione", "Rhea",
				"Tiian", "Lapectus", "Payload", "Bhaskara-2", "INSAT-1A", "SROSS-1", "INSAT-1D", "IRS-1B", "INSAT-2DT",
				"INSAT-2A", "INSAT-2B", "IRS-1E", "IRS-P2");

		List<String> temp2 = satellite1.sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
		temp2.forEach((e) -> System.out.println("satellite :" + e));
		System.err.println("============");
		System.err.println("descending order");

		Stream<String> satellite2 = Stream.of("Erupa", "Ganymede", "Callislo", "Mimas", "Tethya", "Dione", "Rhea",
				"Tiian", "Lapectus", "Payload", "Bhaskara-2", "INSAT-1A", "SROSS-1", "INSAT-1D", "IRS-1B", "INSAT-2DT",
				"INSAT-2A", "INSAT-2B", "IRS-1E", "IRS-P2");

		List<String> temp1 = satellite2.sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println("satellite :" + e));

	}

}
