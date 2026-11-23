package classAndLogicalOperation.my;

import java.util.Scanner;

public class AccountManagement_Terminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = input.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, balance);

        for(int i = 1; ; i++){
            System.out.println("1. Deposite\n2. Withdraw\n3. View Details \n4. Exit");
            int choice = input.nextInt();
            if(choice == 1){
                System.out.print("\nEnter amount to deposit: $");
                double depAmnt = input.nextDouble();
                account.deposite(depAmnt);
            } else if(choice == 2){
                System.out.print("\nEnter amount to withdraw: $");
                double withdrawAmnt = input.nextDouble();
                account.withdraw(withdrawAmnt);
            } else if(choice == 3){
                System.out.println(account.getDetails());
            } else if(choice == 4){
                break;
            } else{
                System.out.println("\nInvalid input.");
                continue;
            }
        }

        input.close();
    }
}
