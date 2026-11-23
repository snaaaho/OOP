package classAndLogicalOperation.practise;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 101001;
        ArrayList<BankAccount> accounts = new ArrayList<>();

        for(int i = 1; ;i++){
            System.out.println("1. Create Account \n2. User Panel \n3. Admin Panel \n4.Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1){
                System.out.print("\nEnter your name: ");
                String name = input.nextLine();
                System.out.print("\nEnter Initial Balance: ");
                double balance = input.nextDouble();
                accounts.add(new BankAccount(name, balance, number));
                System.out.println("Account Created....");
                System.out.println("Account Number: " + number);
                System.out.println("===========================================================");
                number++;
            } else if(choice == 2){
                boolean isFound = false;
                for(int p = 1; p < 2; p++){
                    System.out.println("===========================================================");
                    System.out.println("1. Deposite\n2. Withdraw\n3. View Details");
                    System.out.print("Enter your choice: ");
                    int choice1 = input.nextInt();
                    if(choice1 == 1){
                        System.out.print("\nEnter your account number: ");
                        int accNumber = input.nextInt();
                        for(int j = 0; j < accounts.size(); j++){
                            if(accounts.get(j).accountNumber == accNumber){
                                System.out.print("\nSuccess: Enter balance to deposit: ");
                                double amnt = input.nextDouble();
                                accounts.get(j).deposite(amnt);
                                isFound = true;
                                break;
                            }
                        }
                        if(!isFound){
                            System.out.println("No account exists......");
                            System.out.println("===========================================================");
                        }
                    } else if(choice1 == 2){
                        System.out.print("\nEnter your account number: ");
                        int accNumber = input.nextInt();
                        for(int j = 0; j < accounts.size(); j++){
                            if(accounts.get(j).accountNumber == accNumber){
                                System.out.print("\nSuccess: Enter balance to withdraw: ");
                                double amnt = input.nextDouble();
                                accounts.get(j).withdraw(amnt);
                                isFound = true;
                                break;
                            }
                        }
                        if(!isFound){
                            System.out.println("No account exists......");
                            System.out.println("===========================================================");
                        }
                    } else if(choice1 == 3){
                        System.out.print("\nEnter your account number: ");
                        int accNumber = input.nextInt();
                        for(int j = 0; j < accounts.size(); j++){
                            if(accounts.get(j).accountNumber == accNumber){
                                System.out.println("\nSuccess.");
                                System.out.println(accounts.get(j).getDetails());
                                System.out.println("===========================================================");
                                isFound = true;
                                break;
                            }
                        }
                        if(!isFound){
                            System.out.println("No account exists......");
                            System.out.println("===========================================================");
                        }
                    } else{
                        System.out.println("Invalid Input.");
                        System.out.println("===========================================================");
                        p--;
                        continue;
                    }
                }
            } else if(choice == 3){
                System.out.print("Enter password: ");
                String psk = input.nextLine();
                if(psk.equals("snaho1829")){
                    for(int c = 1; c < 2; c++){
                        boolean isFound = false;
                        System.out.println("1. View Single Account\n2. View All Accounts");
                        System.out.print("Enter your choice: ");
                        int choice2 = input.nextInt();
                        if(choice2 == 1) {
                            System.out.print("\nEnter your account number: ");
                            int accNumber = input.nextInt();
                            for (int j = 0; j < accounts.size(); j++) {
                                if (accounts.get(j).accountNumber == accNumber) {
                                    System.out.println("\nSuccess.");
                                    System.out.println(accounts.get(j).getDetails());
                                    System.out.println("===========================================================");
                                    isFound = true;
                                    break;
                                }
                            }
                            if (!isFound) {
                                System.out.println("No account exists......");
                                System.out.println("===========================================================");
                            }
                        } else if(choice2 == 2){
                            for(int m = 0; m < accounts.size(); m++){
                                System.out.println((m+1) + ". " + accounts.get(m).getDetails());
                                System.out.println();
                            }
                            System.out.println("===========================================================");
                        } else{
                            System.out.println("Invalid input...");
                            System.out.println("===========================================================");
                            c--;
                            continue;
                        }
                    }
                } else{
                    System.out.println("Wrong password!!!");
                }
            } else if(choice == 4){
                break;
            } else{
                System.out.println("Invalid input.");
                continue;
            }
        }
    }
}
