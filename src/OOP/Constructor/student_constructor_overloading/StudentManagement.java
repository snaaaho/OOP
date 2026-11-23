package OOP.Constructor.student_constructor_overloading;

public class StudentManagement {
    public static void main(String[] args){
        Student s1 = new Student("Abid Ul Fahim Snaho", "1829", 21);
        Student s2 = new Student("Ather Nur Samir", "1817", 21, "IIT");

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
    }
}
