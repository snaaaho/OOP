package OOP.Polymorphism.run_time.online_shopping_payment_system;

public class Main {
    public static void main(String[] args){
        Payment p1 = new BkashPayment(1000);
        Payment p2 = new CardPayment(1500);
        Payment p3 = new NagadPayment(1200);

        p1.processPayment();
        p1.processPayment(1000);
        p1.displayTotal();
        System.out.println("-------------------------------------------");
        p2.processPayment();
        p2.processPayment(1500);
        p2.displayTotal();
        System.out.println("-------------------------------------------");
        p3.processPayment();
        p3.processPayment(1200);
        p3.displayTotal();
        System.out.println("-------------------------------------------");
    }
}
