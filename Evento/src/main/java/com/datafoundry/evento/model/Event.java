package com.datafoundry.evento.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="event")
public class Event {
	@Id
	private String id;
	private String event_title;
	private String event_type;
	private String event_category;
	private String organizer_name;
	private String user;
	private Address venue;
	private String start_date;
	private String end_date;
	private String summary;
	private String text;
	private String ticket_type;
	private int number_of_tickets;
	private int ticket_price;
	private Date register_start_date;
	private Date register_end_date;
	private String published;
	private List<Float> coordinates;
	private List<String> tags;
	
	public Event()
	{

	}

	public Event(String id, String event_title, String event_type, String event_category, String organizer_name,
			String user, Address venue, String start_date, String end_date, String summary, String text,
			String ticket_type, int number_of_tickets, int ticket_price, Date register_start_date,
			Date register_end_date, String published, List<Float> coordinates, List<String> tags) {
		super();
		this.id = id;
		this.event_title = event_title;
		this.event_type = event_type;
		this.event_category = event_category;
		this.organizer_name = organizer_name;
		this.user = user;
		this.venue = venue;
		this.start_date = start_date;
		this.end_date = end_date;
		this.summary = summary;
		this.text = text;
		this.ticket_type = ticket_type;
		this.number_of_tickets = number_of_tickets;
		this.ticket_price = ticket_price;
		this.register_start_date = register_start_date;
		this.register_end_date = register_end_date;
		this.published = published;
		this.coordinates = coordinates;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEvent_title() {
		return event_title;
	}

	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public String getEvent_category() {
		return event_category;
	}

	public void setEvent_category(String event_category) {
		this.event_category = event_category;
	}

	public String getOrganizer_name() {
		return organizer_name;
	}

	public void setOrganizer_name(String organizer_name) {
		this.organizer_name = organizer_name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Address getVenue() {
		return venue;
	}

	public void setVenue(Address venue) {
		this.venue = venue;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTicket_type() {
		return ticket_type;
	}

	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}

	public int getNumber_of_tickets() {
		return number_of_tickets;
	}

	public void setNumber_of_tickets(int number_of_tickets) {
		this.number_of_tickets = number_of_tickets;
	}

	public int getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}

	public Date getRegister_start_date() {
		return register_start_date;
	}

	public void setRegister_start_date(Date register_start_date) {
		this.register_start_date = register_start_date;
	}

	public Date getRegister_end_date() {
		return register_end_date;
	}

	public void setRegister_end_date(Date register_end_date) {
		this.register_end_date = register_end_date;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
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

	@Override
	public String toString() {
		return "Event [id=" + id + ", event_title=" + event_title + ", event_type=" + event_type + ", event_category="
				+ event_category + ", organizer_name=" + organizer_name + ", user=" + user + ", venue=" + venue
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", summary=" + summary + ", text=" + text
				+ ", ticket_type=" + ticket_type + ", number_of_tickets=" + number_of_tickets + ", ticket_price="
				+ ticket_price + ", register_start_date=" + register_start_date + ", register_end_date="
				+ register_end_date + ", published=" + published + ", coordinates=" + coordinates + ", tags=" + tags
				+ "]";
	}
	
}
