package com.workz.collect.list.loop.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportName {

	public static void main(String[] args) {
		Stream<String> air = Stream.of("Indira Gandhi Airport", "Cochin International Airport",
				"Sardar Vallabhbhai Patel Airport", "Lokpriya Gopinath Bordoloi Airport", "Kempegowda Airport",
				"Jaipur Airport", "Calicut Airport", "Trivandrum Airport", "Chennai Airport",
				"Chaudhary Charan Singh Airport", "Rajiv Gandhi Airport", "Biju Patnaik Airport", "Kannur Airport",
				"Mangalore Airport", "Dr.Babasaheb Ambedkar Airport", "Gaya Airport", "Veer Savarkar Airport",
				"Dibrugarh Airport", "Tirupati Airport", "Vijayawada Airport");

		List<String> temp = air.filter((e) -> e.startsWith("S")).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println("airport name:" + e));
		System.err.println("============");
		System.err.println("ascending order");

		Stream<String> air1 = Stream.of("Indira Gandhi Airport", "Cochin International Airport",
				"Sardar Vallabhbhai Patel Airport", "Lokpriya Gopinath Bordoloi Airport", "Kempegowda Airport",
				"Jaipur Airport", "Calicut Airport", "Trivandrum Airport", "Chennai Airport",
				"Chaudhary Charan Singh Airport", "Rajiv Gandhi Airport", "Biju Patnaik Airport", "Kannur Airport",
				"Mangalore Airport", "Dr.Babasaheb Ambedkar Airport", "Gaya Airport", "Veer Savarkar Airport",
				"Dibrugarh Airport", "Tirupati Airport", "Vijayawada Airport");

		List<String> temp2 = air1.sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList());
		temp.forEach((e) -> System.out.println("airport name :" + e));
		System.err.println("============");
		System.err.println("descending order");

		Stream<String> air2 = Stream.of("Indira Gandhi Airport", "Cochin International Airport",
				"Sardar Vallabhbhai Patel Airport", "Lokpriya Gopinath Bordoloi Airport", "Kempegowda Airport",
				"Jaipur Airport", "Calicut Airport", "Trivandrum Airport", "Chennai Airport",
				"Chaudhary Charan Singh Airport", "Rajiv Gandhi Airport", "Biju Patnaik Airport", "Kannur Airport",
				"Mangalore Airport", "Dr.Babasaheb Ambedkar Airport", "Gaya Airport", "Veer Savarkar Airport",
				"Dibrugarh Airport", "Tirupati Airport", "Vijayawada Airport");

		List<String> temp1 = air2.sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
		temp1.forEach((e) -> System.out.println("airport name:" + e));
		
		Stream<String> air3 = Stream.of("Indira Gandhi Airport", "Cochin International Airport",
				"Sardar Vallabhbhai Patel Airport", "Lokpriya Gopinath Bordoloi Airport", "Kempegowda Airport",
				"Jaipur Airport", "Calicut Airport", "Trivandrum Airport", "Chennai Airport",
				"Chaudhary Charan Singh Airport", "Rajiv Gandhi Airport", "Biju Patnaik Airport", "Kannur Airport",
				"Mangalore Airport", "Dr.Babasaheb Ambedkar Airport", "Gaya Airport", "Veer Savarkar Airport",
				"Dibrugarh Airport", "Tirupati Airport", "Vijayawada Airport");

		

	}

}
