package com.entities;

import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FeedBack {
	@Id
	int id;
	String email;
	String phoneno;
	@Column(length=200000)
	String Feedback;
	
	
	//getters and setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

	
	//constructor--
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack( String email, String phoneno, String feedback) {
		super();
		this.id = new Random().nextInt(1000);
		this.email = email;
		this.phoneno = phoneno;
		Feedback = feedback;
	}
}
