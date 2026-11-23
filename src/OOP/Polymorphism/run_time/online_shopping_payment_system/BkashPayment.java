package OOP.Polymorphism.run_time.online_shopping_payment_system;

public class BkashPayment extends Payment {
    BkashPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println("Payment through Bkash...");
    }

    @Override
    double transactionFee(){
        return amount * 2 / 100;
    }
}
