package VendingMachine;

public class VendingManagement {
    public static void main(String[] args){
        VendingItem item1 = new VendingItem("Speed", 35, 5);
        VendingItem item2 = new VendingItem("Coffee", 10, 2);
        VendingItem item3 = new VendingItem("Maatador Pinpoint", 5, 10);

        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        item1.purchase();
        item2.purchase();

        item1.displayItem();
        item2.displayItem();

        item2.purchase();
        item2.displayItem();

        item2.purchase();
        item2.displayItem();

        item3.restock(5);

        item1.displayItem();
        item2.displayItem();
        item3.displayItem();
    }
}
