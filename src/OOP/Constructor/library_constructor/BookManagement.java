package OOP.Constructor.library_constructor;

public class BookManagement {
    public static void main(String[] args){
        Book b1 = new Book("Java: The Complete Reference", "Herbert Schildt", 750.0, true);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 850.0, true);
        Book b3 = new Book("Effective Java", "Joshua Bloch", 950.0, true);

        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b1.borrowBook();
        b2.returnBook();
        b3.borrowBook();
        b1.borrowBook();
        b3.returnBook();
        b3.borrowBook();

        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();
    }
}
