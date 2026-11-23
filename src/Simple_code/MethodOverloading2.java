package Simple_code;

public class MethodOverloading2 {

    static int mul(int num1, int num2){
        return num1 * num2;
    }

    static int mul(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }

    static double mul(double num1, double num2){
        return num1 * num2;
    }

    public static void main(String[] args){
        System.out.println(mul(5, 10));
        System.out.println(mul(5, 7, 3));
        System.out.println(mul(3.14, 2.7));
    }
}
