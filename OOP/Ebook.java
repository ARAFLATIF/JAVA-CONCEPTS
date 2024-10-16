public class Ebook extends Book {
    private int pages;

    public Ebook(String title, String author, double price, int pages) {
        super(title, author, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
    }
}
