package com.xworkz.movie.service;

import com.xworkz.movie.dao.MovieDAO;
import com.xworkz.movie.dto.MovieDTO;

public class MovieServiceImpl implements MovieService {
	private MovieDAO movieDao;

	@Override
	public boolean ValidateAndsave(MovieDTO dto) {
		boolean validData = false;

		if (dto != null) {
			System.out.println("dto is not null, can save file");
			String name = dto.getName();
			if (name != null && !name.isEmpty()) {
				System.out.println("name is valid");
				validData = true;

			} else {
				System.out.println("name is not valid");
				validData = false;
			}
			if (validData) {
				String actorName=dto.getActorName();
				if(actorName!=null && !actorName.isEmpty()) {
					System.out.println("actorName is valid");
					validData = true;
				}

			}else {
				System.out.println("actorName is not valid");
				validData = false;
			}
			if(validData) {
				String theaterName=dto.getTheaterName();
				if(theaterName!=null && !theaterName.isEmpty()) {
					System.out.println("theaterName is valid");
					validData = true;
				

			}else {
				System.out.println("theaterName is not valid");
				validData = false;
					
				
			}
			if(validData) {
				double ratings=dto.getRatings();
				if(ratings!=0) {
					System.out.println("rating is valid");
					validData = true;
				}else {
					System.out.println("rating is not valid");
					validData = false;
				}
					
				}
			}
		}

		return false;

	}

	

	@Override
	public MovieDTO ValidateAndfindByactorName(String actorName) {
		System.out.println("invoked ValidateAndfindByactorName");
		if(actorName!=null && !actorName.isEmpty()) {
			this.movieDao.findByactorName(actorName);
			return true;
			
			
		}else {
			System.out.println(" name is not valid");
			
		}
		return null;
	}

	@Override
	public boolean ValidateAndupdateMovieNameByactorName(String actorName) {
		System.out.println("invoked ValidateAndupdateMovieNameByActor");
		if(actorName!=null && !actorName.isEmpty()) {
			
		}


		return false;
	}

	@Override
	public boolean validateAnddeleteMovieNameByactorName(String actorName) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	



}
