package com.fms.flight_management.airport;

import java.util.List;

import com.fms.flight_management.domain.entity.Airport;

public interface AirportService {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
