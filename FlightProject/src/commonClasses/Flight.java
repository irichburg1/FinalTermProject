package commonClasses;
import java.math.BigDecimal;
import java.util.* ;

import java.time.*;

public class Flight {
	
	//attributes
		
	private int numberOfFlights ;
	
	private String flightNumber ;
	
	private Date Date;

	private LocalDate departureTime;

	private LocalDate arrivalTime ;
		
	private String airline ;
	
	private String departingCity ;
	
	private String arrivingCity ;
	
	private BigDecimal cost ;
	
	private int mainCabinSeats ;
	
	private int firstClassSeats ;
	
	
	//initializers
	
	public Flight () {
		
	}


	public int getNumberOfFlights() {
		return numberOfFlights;
	}


	public void setNumberOfFlights(int numberOfFlights) {
		this.numberOfFlights = numberOfFlights;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public Date getDate() {
		return Date;
	}


	public void setDate(Date date) {
		Date = date;
	}


	public LocalDate getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}


	public LocalDate getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getDepartingCity() {
		return departingCity;
	}


	public void setDepartingCity(String departingCity) {
		this.departingCity = departingCity;
	}


	public String getArrivingCity() {
		return arrivingCity;
	}


	public void setArrivingCity(String arrivingCity) {
		this.arrivingCity = arrivingCity;
	}


	public BigDecimal getCost() {
		return cost;
	}


	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}


	public int getMainCabinSeats() {
		return mainCabinSeats;
	}


	public void setMainCabinSeats(int mainCabinSeats) {
		this.mainCabinSeats = mainCabinSeats;
	}


	public int getFirstClassSeats() {
		return firstClassSeats;
	}


	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}
	
	
	
	
	
	
}
