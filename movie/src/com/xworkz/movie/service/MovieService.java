package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDTO;

public interface MovieService {
	public boolean ValidateAndsave(MovieDTO dto);

	MovieDTO ValidateAndfindByactorName(String actorName);

	boolean ValidateAndupdateMovieNameByactorName(String actorName);

	boolean validateAnddeleteMovieNameByactorName(String actorName);

}
