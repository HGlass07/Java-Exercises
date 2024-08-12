package Booking;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class Booking {
	private String hotel;
	private String flight;
	public static Map<String, String> availableBookings = new HashMap<>();
	public static Map<String, String> bookingList = new HashMap<>();
	
	public Booking(String hotel, String flight) {
        this.hotel = hotel;
        this.flight = flight;
        }
	
	public String getHotel() {
		return hotel;
	}
	
	public String getFlight() {
		return flight;
	}
	
	public static void addBooking(String hotel) {
        if (availableBookings.containsKey(hotel) && !bookingList.containsKey(hotel)) {
            bookingList.put(hotel, availableBookings.get(hotel));
            System.out.println(hotel + " at " + availableBookings.get(hotel) + " has been booked.");
        } else if (bookingList.containsKey(hotel)) {
            System.out.println("Booking already exists.");
        } else {
            System.out.println("Hotel not found in available bookings.");
        }
    }
	
	public static void removeBooking(String hotel) {
        if (bookingList.containsKey(hotel)) {
        	bookingList.remove(hotel);
            System.out.println(hotel + " cancelled");
        } 
        else {
            System.out.println("Booking not found");
        }
    }
	
	public static void searchBooking(String hotel) {
		if (availableBookings.containsKey(hotel)) {
            System.out.println("Hotel: " + hotel + ", Flight: " + availableBookings.get(hotel));
        } else {
            System.out.println("No such hotel found.");
        }
	}
	
	public static void displayAvailableBookings() {
        System.out.println("\nAvailable Bookings:");
        for (Map.Entry<String, String> entry : availableBookings.entrySet()) {
            System.out.println("Hotel: " + entry.getKey() + ", Flight: " + entry.getValue());
        }
    }
	
	public static void main(String[] args) {
		availableBookings.put("The Barkley", "UK, Flight A1");
		availableBookings.put("Hotel Aurora", "Norway, Flight 2B");
		availableBookings.put("Four Seasons", "Morocco, Flight 5C");
		availableBookings.put("The Roosevelt", "USA, Flight 56B");
		availableBookings.put("Hilton", "Italy, Flight 7D");
		displayAvailableBookings();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Booking System:");
            System.out.println("1. Search for a Hotel and Flight");
            System.out.println("2. Book a Hotel");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. View Current Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter hotel name to search: ");
                    String searchHotel = scanner.nextLine();
                    searchBooking(searchHotel);
                    break;
                case 2:
                    System.out.print("Enter hotel name to book: ");
                    String bookHotel = scanner.nextLine();
                    addBooking(bookHotel);
                    break;
                case 3:
                    System.out.print("Enter hotel name to cancel booking: ");
                    String cancelHotel = scanner.nextLine();
                    removeBooking(cancelHotel);
                    break;
                case 4:
                    System.out.println("Current bookings: " + bookingList);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
	}
}