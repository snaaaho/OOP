package OOP.Polymorphism.run_time.payment_management_system;

public class Payment {
    private double amount;

    Payment(double amount){
        this.amount = amount;
    }

    void setAmount(double amount){
        this.amount = amount;
    }

    void processPayment(){
        System.out.println("Processing general payment...");
    }

    void processPayment(double amount){
        System.out.println("Processing payment of: " + amount);
    }
}
