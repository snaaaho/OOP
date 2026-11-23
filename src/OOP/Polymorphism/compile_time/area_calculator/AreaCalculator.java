package OOP.Polymorphism.compile_time.area_calculator;

public class AreaCalculator {
    int areaCalculator(int side){
        return side * side;
    }

    int areaCalculator(int length, int width){
        return length * width;
    }

    double areaCalculator(double radius){
        return 3.1416 * radius * radius;
    }
}
