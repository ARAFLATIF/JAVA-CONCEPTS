public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);

        // Display initial account details
        System.out.println("Initial Account Details:");
        account.displayDetails();

        // Deposit money
        account.deposit(500.0);

        // Withdraw money
        account.withdraw(200.0);

        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayDetails();

        // Attempt to set negative balance (this should fail)
        account.setBalance(-100.0);

        // Attempt to withdraw more than the balance (this should fail)
        account.withdraw(1500.0);
    }
}
