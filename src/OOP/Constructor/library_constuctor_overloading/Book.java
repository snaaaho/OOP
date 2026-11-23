package OOP.Constructor.library_constuctor_overloading;

public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    Book(String title, String author, double price, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    void displayInfo(){
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        if(isAvailable){
            System.out.println("Status: Available.");
        }
        else{
            System.out.println("Status: Unavailable.");
        }
        System.out.println("---------------------------------------");
    }

    void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title + " is borrowed successfully...");
        }
        else{
            System.out.println(title + " is unavailable rn...");
        }
        System.out.println("---------------------------------------");
    }

    void returnBook(){
        if(isAvailable){
            System.out.println(title + " cannot be returned, because " + title + " already available...");
        }
        else{
            isAvailable = true;
            System.out.println(title + " is returned successfully...");
        }
        System.out.println("---------------------------------------");
    }
}
