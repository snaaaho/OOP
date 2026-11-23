package Simple_code;

public class MethodOverloading3 {
    
    static int area(int lengthSquare){
        return lengthSquare * lengthSquare;
    }

    static int area(int length, int width){
        return length * width;
    }

    static double area(double radius){
        return 3.1416 * radius * radius;
    }

    public static void main(String[] args){
        System.out.println("Area of square is: " + area(6));
        System.out.println("Area of rectangle is: " + area(4, 6));
        System.out.println("Area of circle is: " + area(3.0));
    }
}
