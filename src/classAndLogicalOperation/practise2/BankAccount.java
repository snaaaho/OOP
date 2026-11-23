package classAndLogicalOperation.practise2;
import java.util.ArrayList;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private boolean isActive;


    BankAccount(String name, double balance, int accountNumber){
        this.accountHolder = name;
        if(balance > 0){
            this.balance = balance;
        } else{
            this.balance = 0;
            System.out.println("Invalid initial balance. Set to $0.0");
        }
        this.accountNumber = accountNumber;
        this.isActive = true;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Success: Deposited $" + amount);
        } else{
            System.out.println("Error: Deposit amount must be greater than $0.");
        }
        System.out.println("===========================================================");
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
        System.out.println("===========================================================");
    }

    String getDetails(){
        return "Account Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nCurrent Balance: $" + balance;
    }
}
