package Simple_code;

import java.util.Scanner;

public class Calculator {
    
    static void add(int a, int b){
        System.out.println("\nYour sum is: " + (a+b));
        System.out.println("==============================================================================");
    }

    static void sub(int a, int b){
        System.out.println("\nYour subtraction is: " + (a-b));
        System.out.println("==============================================================================");
    }

    static void mul(int a, int b){
        System.out.println("\nYour multiplication is: " + (a*b));
        System.out.println("==============================================================================");
    }

    static void div(int a, int b){
        double div = (double) a/ (double)b;
        System.out.println("\nYour division is: " + div);
        System.out.println("==============================================================================");
    }

    static void mod(int a, int b){
        System.out.println("\nYour modulus is: " + (a%b));
        System.out.println("==============================================================================");
    }

    static void pow(int a, int b) {
        if (b < 0) {
            System.out.println("Negative exponent not supported.");
            return;
        }

        int num = 1;

        for (int i = 0; i < b; i++) {
            num *= a;
        }

        System.out.println("\nYour power is: " + num);
        System.out.println("==============================================================================");
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for(int i = 1; ;i++){
            
            System.out.println("What operation do you want?");
            System.out.println("_____________________________");

            System.out.println("1.Add.");
            System.out.println("2.Subtraction.");
            System.out.println("3.Multiplication.");
            System.out.println("4.Division.");
            System.out.println("5.Modulus.");
            System.out.println("6.Power.");
            System.out.println("7.Exit.");

            System.out.print("\nEnter your choice: ");
            int c = input.nextInt();

            if(c == 7){
                System.out.println("Thank you....");
                break;
            }
            else if(c != 1 && c != 2 && c != 3 && c != 4 && c != 5 && c != 6){
                System.out.println("Wrong input....");
                System.out.println("==============================================================================");
                continue;
            }

            System.out.print("\nEnter 1st number: ");
            int a = input.nextInt();

            System.out.print("Enter 2nd number: ");
            int b = input.nextInt();

            if(c == 1){
                add(a, b);
            }
            else if(c == 2){
                sub(a, b);
            }
            else if(c == 3){
                mul(a, b);
            }
            else if(c == 4){
                while(b == 0){
                    System.out.print("Denominator cannot be 0. Enter your 2nd number:");
                    b = input.nextInt();
                }
                div(a, b);
            }
            else if(c == 5){
                while(b == 0){
                    System.out.print("Denominator cannot be 0. Enter your 2nd number:");
                    b = input.nextInt();
                }
                mod(a, b);
            }
            else if(c == 6){
                pow(a, b);
            }
        }

        input.close();
    }    
}
 