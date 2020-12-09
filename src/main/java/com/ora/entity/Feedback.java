package com.ora.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO ) 
	private int feedbackId;
	private int userId;
	private int mechanicId;
	private String feedback;
	private float ratings;
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMechanicId() {
		return mechanicId;
	}
	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	
	

}
