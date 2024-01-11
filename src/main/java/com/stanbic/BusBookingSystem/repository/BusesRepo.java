package com.stanbic.BusBookingSystem.repository;

import com.stanbic.BusBookingSystem.entity.Buses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusesRepo extends JpaRepository<Buses, Long> {
}
