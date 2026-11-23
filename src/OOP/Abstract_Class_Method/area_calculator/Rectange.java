package OOP.Abstract_Class_Method.area_calculator;

public class Rectange extends Shape{

    Rectange(int length, int width){
        super(length, width);
    }

    @Override
    double calculateArea(){
        return length * width;
    }
}
