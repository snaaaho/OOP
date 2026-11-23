package OOP.Inheritance.library_management_system;

public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Java Programming", 101, "James Gosling");
        Magazine m1 = new Magazine("Tech Today", 201, 25);

        b1.displayInfo();
        System.out.println();
        m1.displayInfo();
    }
}
