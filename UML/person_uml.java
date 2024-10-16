+-------------------+
|       Person      |
+-------------------+
| - name: String    |
| - age: int        |
+-------------------+
| + Person(name: String) |
| + setName(name: String): void |
| + setAge(age: int): void     |
| + getName(): String          |
| + getAge(): int              |
| + printPerson(): void        |
+-------------------+




  public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to print person details
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
