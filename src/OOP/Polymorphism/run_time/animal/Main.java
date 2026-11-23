package OOP.Polymorphism.run_time.animal;

public class Main {
    public static void main(String[] args){
        Animal d1 = new Dog();
        Animal c1 = new Cat();

        d1.sound();
        c1.sound();
    }
}
