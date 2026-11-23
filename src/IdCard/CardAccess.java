package IdCard;

public class CardAccess {
    public static void main(String[] args){
        IdCard student1 = new IdCard("Abid Ul Fahim Snaho", "1829", 1500);
        IdCard student2 = new IdCard("Khaled Shah", "1870", 1000);

        student1.displayCardDetails();
        student2.displayCardDetails();

        student1.topupBalance(50);
        student2.deductPrintFee(100);

        student1.displayCardDetails();
        student2.displayCardDetails();
    }
}
