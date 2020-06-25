package com.fms.flight_management.domain.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fms.flight_management.domain.entity.FlightBooking;


@Transactional
public interface FlightBookingRepository extends JpaRepository<FlightBooking, String> {

	List<FlightBooking> findByPassengerId(String passengerId);
}
