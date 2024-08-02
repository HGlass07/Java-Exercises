import java.util.ArrayList;
import java.util.List;


public class Library {
	
	private String bookTitle;
	private static List<Library> books = new ArrayList<>();
	
	
	public Library(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public static void addBook(String bookTitle) {
		Library book = new Library(bookTitle);
		books.add(book);
	}
	
	public static void removeBook(String bookTitle) {
		books.removeIf(book -> book.getBookTitle() == bookTitle);
	}
	
	public static void displayBooks() {
		for (Library book : books) {
			System.out.println(book);
		} 
		
	}
	
	@Override
    public String toString() {
        return bookTitle;
    }

	public static void main(String[] args) {
		Library.addBook("The Lord of the Flies");
		Library.addBook("War and Peace");
		Library.addBook("Norse Mythology");
		
		System.out.println("Books in library: ");
		Library.displayBooks();
		
		Library.removeBook("War and Peace");
		
		System.out.println("Books in library: ");
		Library.displayBooks();
		
	}

}
