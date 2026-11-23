package OOP.Inheritance.bankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    SavingsAccount addInterest(){
        if(interestRate > 0){
            balance += (balance * interestRate / 100);
        }
        return this;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate);
    }
}
