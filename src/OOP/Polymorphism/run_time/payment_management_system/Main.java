package OOP.Polymorphism.run_time.payment_management_system;

public class Main {
    public static void main(String[] args){
        Payment p1 = new BkashPayment(1500);
        Payment p2 = new CardPayment(2500);
        Payment p3 = new Payment(1000);

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();

        p2.setAmount(2000);

        p1.processPayment(3000);
    }
}
