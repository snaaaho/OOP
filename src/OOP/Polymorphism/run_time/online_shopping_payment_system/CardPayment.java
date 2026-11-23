package OOP.Polymorphism.run_time.online_shopping_payment_system;

public class CardPayment extends Payment {
    CardPayment(double amount){
        super(amount);
    }

    @Override
    void processPayment(){
        System.out.println("Payment through Card...");
    }

    @Override
    double transactionFee(){
        return amount * 1.5 / 100;
    }
}
