package OOP.Encapsulation.product_stock_management;

public class Product {
    private String name;
    private double price;
    private int stock;

    Product(String name, double price, int stock){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid product name!");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0!");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative!");
        }

        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    public Product addStock(int amount){
        if(amount > 0){
            stock += amount;
        }
        return this;
    }

    public Product sellProduct(int amount){
        if((amount <= stock) && (amount > 0)){
            stock -= amount;
        }
        return this;
    }

    public Product applyDiscount(double percentage){
        if((percentage > 0) && (percentage <= 100)){
            price = price - (price * (percentage / 100));
        }
        return this;
    }

    void displayInfo(){
        System.out.println("Product: " + name + " | Price: " + price + " | Stock: " + stock );
    }
}
