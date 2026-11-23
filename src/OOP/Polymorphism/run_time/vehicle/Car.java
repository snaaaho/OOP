package OOP.Polymorphism.run_time.vehicle;

public class Car extends Vehicle {
    @Override
    void start(){
        System.out.println("Car starts");
    }

    @Override
    void fuel(){
        System.out.println("Car uses petrol");
    }
}
