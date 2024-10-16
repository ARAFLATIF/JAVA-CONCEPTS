public class AudioBook extends Book {
    private int duration;

    public AudioBook(String title, String author, double price, int duration) {
        super(title, author, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Duration: " + duration + " minutes");
    }
}
