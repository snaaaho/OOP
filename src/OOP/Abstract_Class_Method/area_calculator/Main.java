package OOP.Abstract_Class_Method.area_calculator;

public class Main {
    public static void main(String[] args){
        Shape c = new Circle(7.7);
        Shape s = new Square(5);
        Shape r = new Rectange(5, 4);

        c.displayInfo();
        s.displayInfo();
        r.displayInfo();
    }
}
