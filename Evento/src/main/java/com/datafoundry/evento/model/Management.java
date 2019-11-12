package com.datafoundry.evento.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="collection9")
public class Management
{
	@Id
	private String id;
	private String eventTitle;
	private String eventCategory;
	private String organizerName;
	private Address address;
	private Date eventStartDate;
	private Date eventEndDate;
	private String summary;
	private String ticketType;
	private int numberOfTickets;
	private int ticketPrice;
	private Date ticketstartDate;
	private Date ticketEndDate;
	private String published;
	
	public Management()
	{
		
	}

	public Management(String id, String eventTitle, String eventCategory, String organizerName, Address address,
			Date eventStartDate, Date eventEndDate, String summary, String ticketType, int numberOfTickets,
			int ticketPrice, Date ticketstartDate, Date ticketEndDate, String published) {
		super();
		this.id = id;
		this.eventTitle = eventTitle;
		this.eventCategory = eventCategory;
		this.organizerName = organizerName;
		this.address = address;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.summary = summary;
		this.ticketType = ticketType;
		this.numberOfTickets = numberOfTickets;
		this.ticketPrice = ticketPrice;
		this.ticketstartDate = ticketstartDate;
		this.ticketEndDate = ticketEndDate;
		this.published = published;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getOrganizerName() {
		return organizerName;
	}

	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getTicketstartDate() {
		return ticketstartDate;
	}

	public void setTicketstartDate(Date ticketstartDate) {
		this.ticketstartDate = ticketstartDate;
	}

	public Date getTicketEndDate() {
		return ticketEndDate;
	}

	public void setTicketEndDate(Date ticketEndDate) {
		this.ticketEndDate = ticketEndDate;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}
	
	
}
