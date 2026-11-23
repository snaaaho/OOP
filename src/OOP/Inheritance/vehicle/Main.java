package OOP.Inheritance.vehicle;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car("Toyota");

        c1.drive();
        c1.start();
        System.out.println("Brand name: " + c1.brand);
    }
}
