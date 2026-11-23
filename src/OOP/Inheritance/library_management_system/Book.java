package OOP.Inheritance.library_management_system;

public class Book extends LibraryItem {
    String author;

    Book(String title, int itemId, String author){
        super(title, itemId);
        this.author = author;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}
