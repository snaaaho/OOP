package OOP.Polymorphism.compile_time.calculator;

public class Main {
    public static void main(String[] args){
        Calculator c1 = new Calculator();

        System.out.println(c1.add(10, 20));
        System.out.println(c1.add(10, 20, 30));
        System.out.println(c1.add(10.5, 20.5));
    }
}
