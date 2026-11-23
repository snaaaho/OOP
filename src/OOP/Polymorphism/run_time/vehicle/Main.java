package OOP.Polymorphism.run_time.vehicle;

public class Main {
    public static void main(String[] args){
        Vehicle v1 = new ElectricCar();
        Car v2 = new ElectricCar();
        Vehicle v3 = new Car();

        v1.start();
        v1.fuel();

        v2.start();
        v2.fuel();

        v3.start();
        v3.fuel();
    }
}
