package OOP.Polymorphism.run_time.employee_salary_management_system;

public class Employee {
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    double calculateSalary(){                    //just for override.
        return 0;
    }

    double calculateBonus(){
        return 0;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + calculateSalary());
        System.out.println("Bonus: $" + calculateBonus());
        System.out.println("Total Salary: $" + (calculateSalary() + calculateBonus()));
    }
}
