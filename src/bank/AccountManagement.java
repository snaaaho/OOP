package bank;

public class AccountManagement{
    public static void main(String[] args) {

// Creating the first object
        BankAccount account1 = new BankAccount("Snaho", "1829", 1000.0);
// Creating a second object
        BankAccount account2 = new BankAccount("Khaled", "1870", 500.0);
// Interacting with the objects
        account1.displayDetails();
        account2.displayDetails();
// Performing operations
        account1.deposit(50.0);
        account2.withdraw(100);
// Display updated status
        account1.displayDetails();
        account2.displayDetails();
    }
}
