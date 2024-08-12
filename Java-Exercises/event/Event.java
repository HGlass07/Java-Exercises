package event;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Event {
    private String eventName;
    private LocalDate date;
    private String location;

    public Event(String eventName, LocalDate eventDate, String location) {
        this.eventName = eventName;
        this.date = eventDate;
        this.location = location;
    }

    public String getName() {
        return eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void displayEventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + date);
        System.out.println("Event Location: " + location);
    }

    public boolean checkConflict(Event otherEvent) {
        return this.date.equals(otherEvent.getDate()) && this.location.equals(otherEvent.getLocation());
    }
    
    public static void main(String[] args) {

    	LocalDate seminarDate1 = LocalDate.of(2024, 7, 15);
        Seminar seminar1 = new Seminar("Archeology Seminar", seminarDate1, "Conference Hall A", 5);
        
        LocalDate seminarDate2 = LocalDate.of(2024, 6, 14);
        Seminar seminar2 = new Seminar("Heart Surgery Seminar", seminarDate2, "Conference Hall A", 2);

        LocalDate concertDate1 = LocalDate.of(2024, 7, 15);
        List<String> performers = new ArrayList<>();
        performers.add("Lorn");
        performers.add("Caribou");
        MusicalPerformance concert1 = new MusicalPerformance("Music Festival", concertDate1, "Conference Hall A", performers);

        seminar1.displayEventDetails();
        System.out.println();
        seminar2.displayEventDetails();
        System.out.println();
        concert1.displayEventDetails();
        

        boolean conflict = seminar1.checkConflict(concert1);
        if (conflict) {
            System.out.println("\nWarning! there is a conflict in the date and time of the events.");
        } else {
            System.out.println("\nNo conflict detected between events");
        }
    }
}