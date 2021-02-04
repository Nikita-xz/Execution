package com.xworkz.movie.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.movie.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {
	private List<MovieDTO> database;

	public MovieDAOImpl() {
		this.database = new ArrayList<MovieDTO>();

	}

	@Override
	public boolean save(MovieDTO dto) {
		System.out.println("invoked save in dao");
		boolean added = this.database.add(dto);
		System.out.println("added" + added);
		return added;
		
	}

	@Override
	public MovieDTO findByactorName(String actorName) {
		System.out.println("invoked findByactorName");
		System.out.println("actorName:" + actorName);
		for (MovieDTO movieDTO : this.database) {
			String actorNameFromDTO = movieDTO.getActorName();
			if (actorNameFromDTO.equals(actorName)) {
				System.out.println("actorName found");
				return movieDTO;
			}
		}
		return null;
	}

	@Override
	public boolean updateMovieNameByActor(String actorName) {
		System.out.println("invoked updateMovieNameByActor ");
		System.out.println("actorName:" + actorName);

		MovieDTO dtoFromDB = this.findByactorName(actorName);
		if (dtoFromDB != null) {
			System.out.println("can update , movie is found");
			dtoFromDB.setActorName(actorName);
			return true;
		} else {
			System.out.println("cannot update , movie not found");
		}
		return false;

	}

	@Override
	public boolean deleteMovieNameByactorName(String actorName) {
		MovieDTO deleteFromDTO = this.findByactorName(actorName);
		if (deleteFromDTO != null) {
			this.database.remove(database);
		}
		return false;
	}

}
