package OOP.Abstract_Class_Method.area_calculator;

public class Square extends Shape{
    Square(int side){
        super(side);
    }

    @Override
    double calculateArea(){
        return side * side;
    }
}
