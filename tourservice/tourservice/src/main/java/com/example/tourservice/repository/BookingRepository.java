package com.example.tourservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tourservice.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
