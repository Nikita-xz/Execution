package com.xworkz.flight.dto;

import com.xworkz.flight.constants.Company;

public class FlightBookingDTO {
	private String airplaneCode;
	private Company company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;
	/**
	 * 
	 */
	public FlightBookingDTO() {
		super();
	}
	/**
	 * @param airplaneCode
	 * @param company
	 * @param startingPoint
	 * @param destination
	 * @param totalSeats
	 * @param domestic
	 * @param businessClassPrice
	 * @param economyClassPrice
	 */
	public FlightBookingDTO(String airplaneCode, Company company, String startingPoint, String destination,
			int totalSeats, boolean domestic, double businessClassPrice, double economyClassPrice) {
		super();
		this.airplaneCode = airplaneCode;
		this.company = company;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.domestic = domestic;
		this.businessClassPrice = businessClassPrice;
		this.economyClassPrice = economyClassPrice;
	}
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public boolean isDomestic() {
		return domestic;
	}
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	
	

}
