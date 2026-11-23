package Simple_code;

public class RecursionSum{
    
    static int recSum(int num){
        if(num < 0){
            throw new IllegalArgumentException("Negative number not allowed");
        }
        if(num == 0) return 0;
        else{
            return num + recSum(num - 1);
        }
    }

    public static void main(String[] args){
        int a = 10;
        System.out.println("Sum of first " + a + "th number is: " + recSum(a));
    }
}