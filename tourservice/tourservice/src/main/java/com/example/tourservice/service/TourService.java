package com.example.tourservice.service;

import java.util.List;

import com.example.tourservice.entity.Tour;
import com.example.tourservice.repository.TourRepository;
import org.springframework.stereotype.Service;

@Service  
public class TourService {

    private final TourRepository tourRepository;

    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public Tour addTour(Tour tour) {
        return tourRepository.save(tour);
    }

    public List<Tour> getAllTours() {
        return tourRepository.findAll();
    }

    public Tour getTourById(Long id) {
        return tourRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tour not found with id " + id));
    }

    public void deleteTour(Long id) {
        tourRepository.deleteById(id);
    }
}
