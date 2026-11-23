package OOP.method_chaining.employee_management_system;

//method chaining. current object return by this.

public class Employee {
    String name;
    String id;
    double salary;

    void setDetails(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee increaseSalary(double amount){
        this.salary += amount;
        return this;
    }

    void displayInfo(){
        System.out.println("Name: " + name + " | ID: " + id + " | Salary: " + salary);
    }
}
