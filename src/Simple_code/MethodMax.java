package Simple_code;

public class MethodMax {
    static int max(int num1, int num2){
        if(num1 > num2) return num1;
        else return num2;
    }

    public static void main(String[] args){
        int a = 25;
        int b = 40;

        System.out.println("Max number between " + a + " and " + b + " is: " + max(a, b));
    }
}
