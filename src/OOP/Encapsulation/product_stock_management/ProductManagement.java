package OOP.Encapsulation.product_stock_management;

public class ProductManagement {
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 75000, 10);

        p1.displayInfo();
        p1.setPrice(80000);
        System.out.println("Name: " + p1.getName() + " | Price: " + p1.getPrice() + " | Stock: " + p1.getStock());
        p1.addStock(5).sellProduct(3).applyDiscount(10).displayInfo();
    }
}
