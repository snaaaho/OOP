package Simple_code;

public class RecursionPower{
    static int power(int base, int exponent){
        if(exponent < 0){
            throw new IllegalArgumentException("Negative exponent not allowed");
        }
        if(exponent == 0) return 1;
        else{
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args){
        int base = 2;
        int exponent = 5;
        System.out.println(base + "^" + exponent + " is: " + power(base, exponent));
    }
}