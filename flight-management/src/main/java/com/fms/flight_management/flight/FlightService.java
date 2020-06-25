package com.fms.flight_management.flight;

import java.util.List;

import com.fms.flight_management.domain.entity.Flight;



public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
