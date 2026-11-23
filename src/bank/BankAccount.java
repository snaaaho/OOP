package bank;

class BankAccount {
    // Attributes (Instance Variables)
    private String accountHolder;
    private String accountNumber;
    private double balance;
    // Constructor: Initializes a new account object
    BankAccount(String name, String number, double initialBalance) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = initialBalance;
    }
    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder +  accountNumber +" deposited $" + amount);
    }
    //Method to withdraw money
    void withdraw(double amount){
        if(balance < amount){
            System.out.println("Insufficient balance...");
        }
        else{
            if(amount < 0){
                System.out.println("Withdrawal amount must be positive...");
            }
            else {
                balance -= amount;
                System.out.println(accountHolder +  accountNumber +" withdraw $" + amount);
            }
        }
    }
    // Method to display balance details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("---------------------------");
    }
}
