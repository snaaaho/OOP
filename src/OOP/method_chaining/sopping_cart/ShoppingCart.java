package OOP.method_chaining.sopping_cart;

public class ShoppingCart {
    double totalPrice;

    ShoppingCart addItem(double price){
        totalPrice += price;
        return this;
    }

    ShoppingCart removeItem(double price){
        totalPrice -= price;
        return this;
    }

    ShoppingCart applyDiscount(double amount){
        totalPrice -= amount;
        return this;
    }

    void showDetails(){
        System.out.println("Total price: " + totalPrice);
    }
}
