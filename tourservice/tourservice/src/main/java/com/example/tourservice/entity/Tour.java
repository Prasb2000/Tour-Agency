package com.example.tourservice.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tour")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(nullable = false)
    private String location;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getAvailableSlots() {
		return availableSlots;
	}
	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}
	@Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int duration; // days

    @Column(name = "available_slots", nullable = false)
    private int availableSlots;
    
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

}
