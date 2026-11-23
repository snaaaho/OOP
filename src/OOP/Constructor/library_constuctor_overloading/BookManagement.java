package OOP.Constructor.library_constuctor_overloading;

public class BookManagement {
    public static void main(String[] args){
        Book b1 = new Book("Clean Code", "Robert C. Martin", 850.0);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 950.0, false);

        b1.displayInfo();
        b2.displayInfo();
    }
}
