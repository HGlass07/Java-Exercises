package Airplane;
import java.time.LocalTime;

public class Airplane {
	private String destination;
	private String flightStatus;
	private int flightNumber;
	private LocalTime departureTime;
	
	public Airplane(String destination, String flightStatus, int flightNumber, LocalTime departureTime) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.flightStatus = flightStatus;
	}
	
	public String getDestination() {
		return destination;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public int getflightNumber() {
		return flightNumber;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setFlightStatus(String destination) {
		this.destination = destination;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	
	public void flightDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Flight status: " + flightStatus);
        System.out.println("Flight number: " + flightNumber);
        System.out.println("Departure time: " + departureTime);
    }
	
	public void changeDepTime(LocalTime newDepTime) {
        if (newDepTime.isAfter(departureTime)) {
            this.flightStatus = "Delayed";
        } else{
        	if (newDepTime.isBefore(departureTime)) {
        		this.flightStatus = "On-time";
        	}
        }
        this.departureTime = newDepTime;
        System.out.println("Departure time changed to " + newDepTime);
    }
	
    
	public static void main(String[] args) {
		Airplane airplane = new Airplane("London", "On time", 546, LocalTime.of(15, 30));
        airplane.flightDetails();

        System.out.println("\nChanging departure time to 16:00...");
        airplane.changeDepTime(LocalTime.of(16, 0));
        airplane.flightDetails();
        
        System.out.println("\nChanging departure time to 15:00...");
        airplane.changeDepTime(LocalTime.of(15, 0));
        airplane.flightDetails();

	}

}
