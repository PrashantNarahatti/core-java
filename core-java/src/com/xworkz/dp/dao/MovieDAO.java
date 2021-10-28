package com.xworkz.dp.dao;


import com.xworkz.dto.MovieDTO;
import com.xworkz.dto.MovieDTO;

public class MovieDAO {
	private MovieDTO[] movieDTOs = new MovieDTO[999];
	private int octopus = 0;

	public void create(MovieDTO dto) {
		System.out.println("create movieDTOs cost");

		if (this.octopus < this.movieDTOs.length && this.octopus >= 0) {
			this.movieDTOs[this.octopus++] = dto;

		} else {
			System.out.println("Cannot create the movieDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public void create(MovieDTO dto, int index) {
		System.out.println("create movieDTOs dto and int cost:".concat(dto.getName()));
		if (index >= 0 && this.octopus < this.movieDTOs.length && this.octopus >= 0 && dto != null) {
			this.movieDTOs[this.octopus++] = dto;
			System.out.println("create movieDTOs dto and int cost:".concat(String.valueOf(index)));
		} else {
			System.out.println("Cannot create the movieDTOs :".concat(String.valueOf(this.octopus)));
		}
	}

	public int indexOccupied() {
		System.out.println("indexOccupied".concat(String.valueOf(octopus)));
		return octopus;
	}

	public boolean matchMovieByName(String name) {
		System.out.println("invoked matchMovieByName");
		System.out.println(" name passed: ".concat(name));

		for (int deathNote = 0; deathNote < this.movieDTOs.length; deathNote++) {
			MovieDTO ref = this.movieDTOs[deathNote];
			if (ref != null) {
				System.out.println("ref in index is not null: ".concat(String.valueOf(deathNote)));
				String tempName = ref.getName();
				System.out.println("matching: ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println(" name found");
					return true;
				}

			}
		}
		return false;
	}

}
