public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("John");
        User user2 = new User("Alice");

        // Create books
        Book audioBook1 = new AudioBook("The Great Gatsby", "F. Scott Fitzgerald", 19.99, 360);
        Book ebook1 = new Ebook("To Kill a Mockingbird", "Harper Lee", 14.99, 281);
        Book audioBook2 = new AudioBook("1984", "George Orwell", 17.99, 420);
        Book ebook2 = new Ebook("Pride and Prejudice", "Jane Austen", 12.99, 272);

        // Add books to users
        user1.addBook(audioBook1);
        user1.addBook(ebook1);
        user2.addBook(audioBook2);
        user2.addBook(ebook2);

        // Display books for each user
        System.out.println("Books for " + user1.name + ":");
        user1.displayBooks();

        System.out.println("\nBooks for " + user2.name + ":");
        user2.displayBooks();

        // Get a book by title
        Book book = user1.getBookByTitle("To Kill a Mockingbird");
        if (book!= null) {
            book.displayDetails();
        } else {
            System.out.println("Book not found.");
        }
    }
}
