package OOP.Library;

public class BookManagement {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.title = "Java: The Complete Reference";
        b1.author = "Herbert Schildt";
        b1.price = 750.0;
        b1.isAvailable = true;

        b2.title = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.price = 850.0;
        b2.isAvailable = true;

        b3.title = "Effective Java";
        b3.author = "Joshua Bloch";
        b3.price = 950.0;
        b3.isAvailable = true;

        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b1.borrowBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b2.returnBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b3.borrowBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b1.borrowBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b3.returnBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();

        b3.borrowBook();
        System.out.println();
        b1.displayInfo();
        System.out.println();
        b2.displayInfo();
        System.out.println();
        b3.displayInfo();
        System.out.println();
    }
}
