package OOP.Encapsulation.employee_salary;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    Employee increaseSalary(double amount){
        if(amount >= 0){
            salary += amount;
        }
        return this;
    }

    Employee deductSalary(double amount) {
        if ((salary >= amount) && (amount >= 0)) {
            salary -= amount;
        }
        return this;
    }

    void displayInfo(){
        System.out.println("Employee Name: " + name + " | Salary: " + salary);
    }
}
