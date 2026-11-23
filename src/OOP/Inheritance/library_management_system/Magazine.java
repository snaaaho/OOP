package OOP.Inheritance.library_management_system;

public class Magazine extends LibraryItem{
    int issueNumber;

    Magazine(String title, int itemId, int issueNumber){
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
