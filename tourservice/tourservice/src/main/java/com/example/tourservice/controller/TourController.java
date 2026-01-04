package com.example.tourservice.controller;

import com.example.tourservice.entity.Tour;
import com.example.tourservice.service.TourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
@CrossOrigin(origins = "http://localhost:4200")

public class TourController {

    private final TourService tourService;

    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    // CREATE
    @PostMapping
    public Tour createTour(@RequestBody Tour tour) {
        return tourService.addTour(tour);
    }

    // READ ALL
    @GetMapping
    public List<Tour> getAllTours() {
        return tourService.getAllTours();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Tour getTour(@PathVariable Long id) {
        return tourService.getTourById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteTour(@PathVariable Long id) {
        tourService.deleteTour(id);
        return "Tour deleted successfully";
    }
}
