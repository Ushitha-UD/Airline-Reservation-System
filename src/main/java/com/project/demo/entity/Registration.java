package com.project.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Registration {
	@Id
	int id;
	String name;
	long contact_no;
	String email_id;
	String address;
	String booking_class;
	
	public Registration() {
		super();
	}
 
	public Registration(int id, String name, long contact_no, String email_id, String address,
			String booking_class) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
		this.email_id = email_id;
		this.address = address;
		this.booking_class = booking_class;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBooking_class() {
		return booking_class;
	}
	public void setBooking_class(String booking_class) {
		this.booking_class = booking_class;
	}
}