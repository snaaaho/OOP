package Simple_code;

public class Grade{
    public static void main(String[] args){
        int num = 75;

        if (num >= 80) {
            System.out.println("A+");
        } else if (num >= 70) {
            System.out.println("A");
        } else if (num >= 60) {
            System.out.println("A-");
        } else {
            System.out.println("Fail or below A-");
        }
    }
}