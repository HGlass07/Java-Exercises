import java.util.ArrayList;
import java.util.List;


public class Book {
	
	private String title;
	private String author;
	private int ISBN;
	private static List<Book> books = new ArrayList<>();
	
	
	public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
	

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getISBN() {
		return ISBN;
	}
	

	public void setTitle(String title) {
	    this.title = title;
	  }
	public void setAuthor(String author) {
	    this.author = author;
	  }
	public void setISBN(int ISBN) {
	    this.ISBN = ISBN;
	  }

	@Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', ISBN=" + ISBN + '}';
    }

	public static void addBook(String title, String author, int ISBN) {
		Book book = new Book(title, author, ISBN);
		books.add(book);
	}
	
	public static void removeBook(String title) {
		books.removeIf(book -> book.getTitle() == title);
	}
	
	public static void showBooks() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	

	public static void main(String[] args) {
		
		
		Book.addBook("1984", "George Orwell", 452457);
		Book.addBook("Dune", "Frank Herbert", 556789);
		System.out.println("Book list: ");
		Book.showBooks();
		
		System.out.println("Book removed: ");
		Book.removeBook("1984");
		Book.showBooks();
	}

}



