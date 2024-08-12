package event;

import java.time.LocalDate;

public class Seminar extends Event {
    private int numberOfSpeakers;

    public Seminar(String eventName, LocalDate eventDate, String location, int numberOfSpeakers) {
        super(eventName, eventDate, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}
