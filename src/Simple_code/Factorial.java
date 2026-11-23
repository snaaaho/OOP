package Simple_code;

public class Factorial {
    
    static int factorial(int num, int mul){
        if(num <= 0) return mul;
        else{
            mul *= num;
            return factorial(num - 1, mul);
        }
    }

    public static void main(String[] args){
        int a = 7;
        int mul = 1;
        System.out.println(a + "! is: " + factorial(a, mul));
    }
}
