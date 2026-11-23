package Simple_code;

import java.util.Scanner;

public class Input22{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.print("Are you ***(true/false): ");
        boolean tf = input.nextBoolean();


        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
        System.out.println("Your are a gay???: " + tf);

        input.close();
    }
}