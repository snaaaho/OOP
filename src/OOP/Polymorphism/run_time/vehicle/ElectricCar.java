package OOP.Polymorphism.run_time.vehicle;

public class ElectricCar extends Car {
    @Override
    void fuel(){
        System.out.println("Electric car uses battery");
    }
}
