package reservation;

import java.time.LocalDate;

public class ResortReservation extends Reservation {
    private String roomNumber;

    public ResortReservation(String reservationID, String customerName, LocalDate reservationDate, String roomNumber) {
        super(reservationID, customerName, reservationDate);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayReservationDetails() {
        super.displayReservationDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}