package OOP.Polymorphism.run_time.payment_management_system;

public class CardPayment extends Payment {
    CardPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println("Processing payment through Card...");
    }
}
