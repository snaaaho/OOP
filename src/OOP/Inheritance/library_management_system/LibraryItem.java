package OOP.Inheritance.library_management_system;

public class LibraryItem {
    String title;
    int itemId;

    LibraryItem(String title, int itemId){
        this.title = title;
        this.itemId = itemId;
    }

    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Item Id: " + itemId);
    }
}
