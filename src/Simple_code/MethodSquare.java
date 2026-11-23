package Simple_code;

public class MethodSquare {
    static int square(int num){
        return num * num;
    }

    public static void main(String[] args){
        int a = 7;
        System.out.println("Square of " + a + " is " + square(a));
    }
}
