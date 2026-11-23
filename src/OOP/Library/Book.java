package OOP.Library;

public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    void displayInfo(){
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        if(isAvailable){
            System.out.println("Available");
        }
        else{
            System.out.println("Unavailable");
        }
        System.out.println("--------------------------------------------------------");
    }

    void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title + " is borrowed successfully...");
        }
        else{
            System.out.println(title + " is unavailable rn...");
        }
    }

    void returnBook(){
        if(isAvailable){
            System.out.println(title + " cannot be returned, cuz " + title + " is already available...");
        }
        else{
            isAvailable = true;
            System.out.println(title + " is returned successfully...");
        }
    }
}
