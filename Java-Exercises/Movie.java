import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void addActor(String actor) {
        actors.add(actor);
        System.out.println(actor + " added to the movie " + title);
    }

    public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    public void displayReviews() {
        System.out.println("Reviews for " + title + ":");
        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }

    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.print("Actors: ");
        for (String actor : actors) {
            System.out.print(actor + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Movie movie = new Movie("The Matrix", "The Wachowskis");

        movie.addActor("Keanu Reeves");
        movie.addActor("Lawrence Fishburne");
        movie.addActor("Carrie-Anne Moss");

        movie.addReview("Thanks to the Wachowskis' imaginative vision, "
        		+ "The Matrix is a smartly crafted combination of "
        		+ "spectacular action and groundbreaking special effects.");
        movie.addReview("The Wachowskis proceed to turn the world as we know "
        		+ "it into a virtual reality landscape with a 20th century "
        		+ "tech-noir look (lit with a sickly green hue, like the glow of an old "
        		+ "IBM computer screen) and the physics of a video game.");

        movie.displayMovieDetails();
        movie.displayReviews();
    }
}