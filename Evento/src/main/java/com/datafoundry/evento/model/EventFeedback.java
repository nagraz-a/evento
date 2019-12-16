package com.datafoundry.evento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="eventFeedback")
public class EventFeedback {

	@Id
	private String id;
	private String event_feedback;
	private String welcome_activity;
	private String session1;
	private String session2;
	private String closing_activity;
	private String comments;
	private String suggestions;
	@DBRef
	private Event event;
	@DBRef
	private User participants;
	public EventFeedback(String id, String event_feedback, String welcome_activity, String session1, String session2,
			String closing_activity, String comments, String suggestions, Event event, User participants) {
		super();
		this.id = id;
		this.event_feedback = event_feedback;
		this.welcome_activity = welcome_activity;
		this.session1 = session1;
		this.session2 = session2;
		this.closing_activity = closing_activity;
		this.comments = comments;
		this.suggestions = suggestions;
		this.event = event;
		this.participants = participants;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEvent_feedback() {
		return event_feedback;
	}
	public void setEvent_feedback(String event_feedback) {
		this.event_feedback = event_feedback;
	}
	public String getWelcome_activity() {
		return welcome_activity;
	}
	public void setWelcome_activity(String welcome_activity) {
		this.welcome_activity = welcome_activity;
	}
	public String getSession1() {
		return session1;
	}
	public void setSession1(String session1) {
		this.session1 = session1;
	}
	public String getSession2() {
		return session2;
	}
	public void setSession2(String session2) {
		this.session2 = session2;
	}
	public String getClosing_activity() {
		return closing_activity;
	}
	public void setClosing_activity(String closing_activity) {
		this.closing_activity = closing_activity;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public User getParticipants() {
		return participants;
	}
	public void setParticipants(User participants) {
		this.participants = participants;
	}
	
	
}
