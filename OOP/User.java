import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String name;
    private List<Book> books;
    private Map<String, Book> bookMap;

    public User(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getTitle(), book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }

    public Book getBookByTitle(String title) {
        return bookMap.get(title);
    }
}
