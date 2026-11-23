package OOP.Polymorphism.run_time.payment_management_system;

public class BkashPayment extends Payment {
    BkashPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println("Processing payment through Bkash...");
    }
}
