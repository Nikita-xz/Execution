package com.xworkz.flight.booking;
import com.xworkz.flight.FlightBookingTester;
import com.xworkz.flight.constants.Company;
import com.xworkz.flight.dto.FlightBookingDTO;

public class FlightBooking {
	private FlightBookingDTO[] dtos;
	private int currentIndex = 0;

	public FlightBooking(int size) {
		dtos = new FlightBookingDTO[size];
	}

	public void acceptFlightBooking(FlightBookingDTO dto) {
		if (dto != null && this.currentIndex < 6) {
			String code = dto.getAirplaneCode();
			Company company = dto.getCompany();
			String startingPoint = dto.getStartingPoint();
			String destination = dto.getDestination();
			int totalSeats = dto.getTotalSeats();
			double businessClassPrice = dto.getBusinessClassPrice();
			double economyClassPrice = dto.getBusinessClassPrice();
			if (code != null && company != null && startingPoint != null && destination != null
					&& businessClassPrice > 1000) {
				System.out.println("we can add flight");
				System.out.println("current index is " + this.currentIndex);
				dtos[this.currentIndex] = dto;
				this.currentIndex++;
			} else {
				if (dto != null) {
					System.out.println("cannot add more car, total  " + this.currentIndex);
				}
				System.out.println("current index : " + this.currentIndex);
			}
		}
	}

	public void displayBookingByStartingPoint(String startingPoint) {
		if (startingPoint != null) {
			// System.out.println("Starting point is: " + startingPoint);
			boolean start = false;
			for (int i = 0; i < this.dtos.length; i++) {
				FlightBookingDTO ref = this.dtos[i];
				String localstart = ref.getStartingPoint();
				if (startingPoint.equals(localstart)) {
					System.out.println("starting point is  " + ref.getStartingPoint());
					System.out.println(ref.getAirplaneCode());
					System.out.println(ref.getCompany());
					System.out.println(ref.getDestination());
					System.out.println(ref.getTotalSeats());
					System.out.println(ref.getBusinessClassPrice());
					System.out.println(ref.getEconomyClassPrice());
					start = true;
					break;
				}
			}
			if (start == false) {
				System.out.println("starting point not found");
			}
		}
	}

	public void displayBooking() {
		for (int i = 0; i < this.dtos.length; i++) {
			FlightBookingDTO dto = this.dtos[i];
			if (dto != null) {
				// System.out.println(dto);
				System.out.println(dto.getAirplaneCode());
				System.out.println(dto.getStartingPoint());
				System.out.println(dto.getDestination());
				System.out.println(dto.getTotalSeats());
				System.out.println(dto.getBusinessClassPrice());
				System.out.println(dto.getEconomyClassPrice());
			}
		}
	}

}
