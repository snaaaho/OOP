package OOP.Inheritance.person;

public class Student extends Person {
    String name = "Karim";

    void introduce(){
        System.out.println("I am a student.");
    }

    void displayInfo(){
        System.out.println("Child: " + name);
        System.out.println("Parent: " + super.name);
        introduce();
        super.introduce();
    }
}
