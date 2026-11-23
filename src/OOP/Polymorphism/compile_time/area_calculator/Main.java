package OOP.Polymorphism.compile_time.area_calculator;

public class Main {
    public static void main(String[] args){
        AreaCalculator a1 = new AreaCalculator();

        System.out.println("Area of square is: " + a1.areaCalculator(5));
        System.out.println("Area of rectangle is: " + a1.areaCalculator(10, 5));
        System.out.println("Area of circle is: " + a1.areaCalculator(7.0));
    }
}
