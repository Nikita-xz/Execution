package com.xworkz.flight;
import java.util.Scanner;
import com.xworkz.flight.booking.FlightBooking;
import com.xworkz.flight.constants.Company;
import com.xworkz.flight.dto.FlightBookingDTO;


public class FlightBookingTester {

	public static void main(String[] args) {

		

			FlightBooking book = new FlightBooking(50);

			FlightBookingDTO dto = new FlightBookingDTO("INDA123", Company.KINGFISHER, "Banglore", "Australia", 3, true,
					30000, 45000);
			book.acceptFlightBooking(dto);
			book.displayBooking();

			FlightBookingDTO dto2 = new FlightBookingDTO("AIR234", Company.AIRINDIA, "Hubli", "Bangalore", 4, false, 40000,
					43000);
			book.acceptFlightBooking(dto2);
			book.displayBooking();

			FlightBookingDTO dto3 = new FlightBookingDTO("INDIA675", Company.INDIGO, "Belgaum", "Italy", 5, true, 45000,
					43000);
			book.acceptFlightBooking(dto3);
			book.displayBooking();

			book.displayBookingByStartingPoint("Belgaum");

		}


	}


