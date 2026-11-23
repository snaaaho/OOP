package Simple_code;

public class MethodOverloading1 {

    static int add(int num1, int num2){
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    static double add(double num1, double num2){
        return num1 + num2;
    }

    public static void main(String[] args){
        System.out.println(add(5, 10));
        System.out.println(add(10, 24, 41));
        System.out.println(add(23.45, 12.23));
    }
}
