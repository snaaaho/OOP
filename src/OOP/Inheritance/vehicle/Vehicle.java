package OOP.Inheritance.vehicle;

public class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    void start(){
        System.out.println(brand + " is starting.");
    }
}
