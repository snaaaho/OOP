package OOP.Constructor.student_constructor_overloading;

public class Student {
    String name;
    String id;
    int age;
    String dept;

    Student(String name, String id, int age){
        this(name, id, age, "IIT");
    }
    Student(String name, String id, int age, String dept){
        this.name = name;
        this.id = id;
        this.age = age;
        this.dept = dept;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("--------------------------------");
    }
}
