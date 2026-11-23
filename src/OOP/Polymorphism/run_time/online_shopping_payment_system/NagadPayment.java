package OOP.Polymorphism.run_time.online_shopping_payment_system;

public class NagadPayment extends Payment {
    NagadPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println("Payment through Nagad...");
    }

    @Override
    double transactionFee(){
        return amount * 1 / 100;
    }
}
