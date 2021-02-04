package com.xworkz.movie.dao;

import com.xworkz.movie.dto.MovieDTO;

public interface MovieDAO {
	public boolean save(MovieDTO dto);

	MovieDTO findByactorName(String actorName);

	boolean updateMovieNameByActor(String actorName);

	boolean deleteMovieNameByactorName(String actorName);

}
