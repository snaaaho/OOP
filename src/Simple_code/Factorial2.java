package Simple_code;

public class Factorial2 {
    
    static int factorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Negative number not allowed");      //new jinish :(
        }

        if (num == 0 || num == 1) {
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args){
        int a = 7;
        System.out.println(a + "! is: " + factorial(a));
    }
}
