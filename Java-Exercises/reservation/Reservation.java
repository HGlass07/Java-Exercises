package reservation;

import java.time.LocalDate;

public class Reservation {
	
	private String reservationID;
    private String customerName;
    private LocalDate reservationDate;

    public Reservation(String reservationID, String customerName, LocalDate reservationDate) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public boolean isReservationActive() {
        return reservationDate.isAfter(LocalDate.now()) || reservationDate.isEqual(LocalDate.now());
    }

    public void displayReservationDetails() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Reservation Status: " + (isReservationActive() ? "Active" : "Expired"));
    }

	public static void main(String[] args) {
        ResortReservation resortReservation1 = new ResortReservation("1", "Freya Tibbs", LocalDate.of(2024, 10, 19), "123");
        resortReservation1.displayReservationDetails();
        System.out.println();

        RailwayReservation railwayReservation1 = new RailwayReservation("2", "Andy Simmons", LocalDate.of(2024, 5, 5), "B6");
        railwayReservation1.displayReservationDetails();
        System.out.println();

        RailwayReservation railwayReservation2 = new RailwayReservation("3", "John Smith", LocalDate.of(2024, 11, 5), "D12");
        railwayReservation2.displayReservationDetails();
        railwayReservation2.setCustomerName("Tyler Smith");
        System.out.println();
        railwayReservation2.displayReservationDetails();

	}

}
