package com.MBS.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seats {
	@Id
	@Column(name = "BOOKINGID")
	private int bookingId;
	@Column(name = "SHOWID")
	private int showId;
	@Column(name = "USERID")
	private int userId;
	@Column(name = "BOOKEDDATES")
	private LocalDate bookedDate;
	@Column(name = "SHOWDATES")
	private LocalDate showDate;
	@Column(name = "TOTALSEATS")
	private int noOfSeats;
	@Column(name = "TOTALSEATSCANCELLED")
	private int noOfSeatsCancelled;
	@Column(name = "AMOUNTPAID")
	private float costOfSeats;
	@Column(name = "SEATTYPE")
	private String typesOfSeats;
	public Seats() {
	
	}
	
public Seats(int i, String string, int j, int k, int l, String string2, int m, String string3, int n) {
		
	}

public int getBookingId() {
	return bookingId;
}

public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}

public int getShowId() {
	return showId;
}

public void setShowId(int showId) {
	this.showId = showId;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public LocalDate getBookedDate() {
	return bookedDate;
}

public void setBookedDate(LocalDate bookedDate) {
	this.bookedDate = bookedDate;
}

public LocalDate getShowDate() {
	return showDate;
}

public void setShowDate(LocalDate showDate) {
	this.showDate = showDate;
}

public int getNoOfSeats() {
	return noOfSeats;
}

public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}

public int getNoOfSeatsCancelled() {
	return noOfSeatsCancelled;
}

public void setNoOfSeatsCancelled(int noOfSeatsCancelled) {
	this.noOfSeatsCancelled = noOfSeatsCancelled;
}

public float getCostOfSeats() {
	return costOfSeats;
}

public void setCostOfSeats(float costOfSeats) {
	this.costOfSeats = costOfSeats;
}

public String getTypesOfSeats() {
	return typesOfSeats;
}

public void setTypesOfSeats(String typesOfSeats) {
	this.typesOfSeats = typesOfSeats;
}

@Override
public String toString() {
	return "Seats [bookingId=" + bookingId + ", showId=" + showId + ", userId=" + userId + ", bookedDate=" + bookedDate
			+ ", showDate=" + showDate + ", noOfSeats=" + noOfSeats + ", noOfSeatsCancelled=" + noOfSeatsCancelled
			+ ", costOfSeats=" + costOfSeats + ", typesOfSeats=" + typesOfSeats + "]";
}

}
