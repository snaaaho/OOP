package IdCard;

class IdCard {
    private String studentName;
    private String studentId;
    private double accountBalance;

    IdCard(String name, String id, double balance){
        this.studentName = name;
        this.studentId = id;
        this.accountBalance = balance;
    }

    void topupBalance(double amount){
        if(amount >= 0){
            accountBalance += amount;
            System.out.println(studentName + " topped up $" + amount);
        }
        else{
            System.out.println("Cannot topped up negative balance");
        }
    }

    void deductPrintFee(double cost){
        if(accountBalance >= cost){
            if(cost >= 0){
                accountBalance -= cost;
                System.out.println(studentName + " paid $" + cost);
            }
            else{
                System.out.println("Cost cannot be negative.");
            }
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }

    void displayCardDetails(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Balance: " + accountBalance);
        System.out.println("------------------------------------------------------");
    }
}
