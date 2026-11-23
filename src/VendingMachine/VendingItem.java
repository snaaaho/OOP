package VendingMachine;

class VendingItem {
    private String itemName;
    private double unitPrice;
    private int itemQuantity;

    VendingItem(String name, double price, int quantity){
        this.itemName = name;
        this.unitPrice = price;
        this.itemQuantity = quantity;
    }

    void purchase(){
        if(itemQuantity > 0){
            itemQuantity --;
            System.out.println(itemName + " is purchased successfully...");
        }
        else{
            isOutOfStock();
        }
    }

    void isOutOfStock(){
        System.out.println(itemName + " is out of stock...");
    }

    void restock(int count){
        if(count >= 0){
            itemQuantity += count;
            System.out.println(itemName + " restocked successfully...");
        }
        else{
            System.out.println("Cannot restocked negative numbers of item...");
        }
    }

    void displayItem(){
        System.out.println("Item name: " + itemName + " Quantity: " + itemQuantity + " Unit price: " + unitPrice);
    }
}
