package OOP.Abstract_Class_Method.area_calculator;

public class Circle extends Shape {
    Circle(double radius){
        super(radius);
    }

    @Override
    double calculateArea() {
        return 3.1416 * radius * radius;
    }
}
