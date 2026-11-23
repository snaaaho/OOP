package OOP.method_chaining.employee_salary_management;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    Employee increaseSalary(double amount){
        salary += amount;
        return this;
    }

    Employee deductSalary(double amount){
        salary -= amount;
        return this;
    }

    void displayInfo(){
        System.out.println("Employee name: " + name + " | Salary: " + salary);
    }
}
