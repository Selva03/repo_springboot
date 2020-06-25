package com.fms.flight_management.airport;

import com.fms.flight_management.system.ResourceNotFoundException;

public class AirportNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = -4185306016942664972L;

	public AirportNotFoundException(String airportId) {
		super("Airport", "airport-id", airportId);
	}

}
