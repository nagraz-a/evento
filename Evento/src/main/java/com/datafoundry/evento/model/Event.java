package com.datafoundry.evento.model;

import java.util.List;

public class Event {
	private String id;
	private String title;
	private String about;
	private String category;
	private String type;
	private float price;
	private Address Venue;
	private List<Float> coordinates;
	private List<String> tags;
	private List<Day> days;
	public Event() {
		
	}
	public Event(String id, String title, String about, String category, String type, float price, Address venue,
			List<Float> coordinates, List<String> tags, List<Day> days) {
		super();
		this.id = id;
		this.title = title;
		this.about = about;
		this.category = category;
		this.type = type;
		this.price = price;
		Venue = venue;
		this.coordinates = coordinates;
		this.tags = tags;
		this.days = days;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;  
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Address getVenue() {
		return Venue;
	}
	public void setVenue(Address venue) {
		Venue = venue;
	}
	public List<Float> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<Day> getDays() {
		return days;
	}
	public void setDays(List<Day> days) {
		this.days = days;
	}
	
	
}
