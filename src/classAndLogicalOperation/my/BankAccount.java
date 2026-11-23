package classAndLogicalOperation.my;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private boolean isActive;

    BankAccount(String name, int accountNumber, double balance){
        this.accountHolder = name;
        this.accountNumber = accountNumber;
        if(balance > 0){
            this.balance = balance;
        } else{
            this.balance = 0;
            System.out.println("Invalid initial balance. Set to $0.0");
        }
    }

    void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Success: Deposited $" + amount);
        } else{
            System.out.println("Error: Deposit amount must be greater than $0.");
        }
    }

    void withdraw(double amount){
        if((amount > 0) && (amount <= balance)){
            balance -= amount;
            System.out.println("Success: Withdrew $" + amount);
        } else if(amount > balance){
            System.out.println("Declined: Insufficient funds! Current balance: $" + balance);
        } else{
            System.out.println("Error: Invalid withdrawal amount.");
        }
    }

    String getDetails(){
        return "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nCurrent Balance: $" + balance;
    }
}
