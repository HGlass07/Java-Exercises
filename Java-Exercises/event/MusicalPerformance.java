package event;

import java.time.LocalDate;
import java.util.List;

public class MusicalPerformance extends Event {
    private List<String> performers;

    public MusicalPerformance(String eventName, LocalDate eventDate, String location, List<String> performers) {
        super(eventName, eventDate, location);
        this.performers = performers;
    }

    public List<String> getPerformers() {
        return performers;
    }

    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}