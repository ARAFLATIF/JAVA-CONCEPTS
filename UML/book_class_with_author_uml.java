+-------------------+       +---------------+
|       Book        |       |      Person   |
+-------------------+       +---------------+
| - title: String   |       | - name: String|
| - publisher: String|       | - age: int    |
| - author: Person  |       +---------------+
+-------------------+       | + Person(name: String) |
| + Book(title: String,    | + setName(name: String): void |
|       publisher: String, | + setAge(age: int): void     |
|       author: Person)    | + getName(): String          |
| + setTitle(title: String): void | + getAge(): int              |
| + setPublisher(publisher: String): void | + printPerson(): void        |
| + setAuthor(author: Person): void     |                           |
| + getTitle(): String          |                           |
| + getPublisher(): String      |                           |
| + getAuthor(): Person         |                           |
| + printBook(): void           |                           |
+-------------------+           +---------------+



  // Person class
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}

// Book class
public class Book {
    private String title;
    private String publisher;
    private Person author;

    public Book(String title, String publisher, Person author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void printBook() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: ");
        author.printPerson();
    }
}
