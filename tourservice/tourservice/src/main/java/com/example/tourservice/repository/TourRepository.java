package com.example.tourservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tourservice.entity.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {

}
