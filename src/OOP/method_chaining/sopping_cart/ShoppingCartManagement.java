package OOP.method_chaining.sopping_cart;

public class ShoppingCartManagement {
    public static void main(String[] args){
        ShoppingCart c1 = new ShoppingCart();
        c1.addItem(1200).addItem(800).removeItem(300).applyDiscount(200).showDetails();
    }
}
