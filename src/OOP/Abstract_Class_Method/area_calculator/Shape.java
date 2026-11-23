package OOP.Abstract_Class_Method.area_calculator;

abstract class Shape {
    double radius;
    int length, width, side;
    abstract double calculateArea();

    Shape(int side){
        this.side = side;
    }

    Shape(double radius){
        this.radius = radius;
    }

    Shape(int length, int width){
        this.length = length;
        this.width = width;
    }

    void displayInfo(){
        System.out.println("Area: " + calculateArea());
    }
}
