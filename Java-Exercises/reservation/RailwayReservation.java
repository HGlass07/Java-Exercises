package reservation;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationID, String customerName, LocalDate reservationDate, String seatNumber) {
        super(reservationID, customerName, reservationDate);
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void displayReservationDetails() {
        super.displayReservationDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}