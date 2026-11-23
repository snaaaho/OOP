package OOP.Inheritance.bankAccount;

public class Main {
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount("Snaho", 10000, 5);

        s1.deposite(2000);
        s1.addInterest().displayInfo();
    }
}
