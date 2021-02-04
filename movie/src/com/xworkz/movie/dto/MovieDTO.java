package com.xworkz.movie.dto;

import com.xworkz.movie.dto.MovieDTO;

public class MovieDTO {
	private String name;
    private String theaterName;
	private double ratings;
	private String actorName;
	public MovieDTO(String name, String theaterName, double ratings, String actorName) {
		super();
		this.name = name;
		this.theaterName = theaterName;
		this.ratings = ratings;
		this.actorName = actorName;
	}
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", theaterName=" + theaterName + ", ratings=" + ratings + ", actorName="
				+ actorName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof MovieDTO) {
			MovieDTO converted = (MovieDTO) obj;

			if (this.actorName != null && this.actorName.equals(converted.getActorName())) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	
	
	

}
