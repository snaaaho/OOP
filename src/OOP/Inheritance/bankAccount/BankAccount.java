package OOP.Inheritance.bankAccount;

public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    BankAccount deposite(double amount){
        if(amount > 0){
            balance += amount;
        }
        return this;
    }

    void displayInfo(){
        System.out.println("Account Holder's Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
