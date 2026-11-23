package OOP.Polymorphism.run_time.online_shopping_payment_system;

public class Payment {
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    void processPayment(){
        System.out.println("Processing general payment...");
    }

    double transactionFee(){
        return amount * 0 / 100;
    }

    void processPayment(double amount){
        System.out.println("Payment of: $" + amount);
    }

    void displayTotal(){
        System.out.println("Total amount is: $" + (amount + transactionFee()));
    }
}
