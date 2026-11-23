package OOP.Polymorphism.run_time.employee_salary_management_system;

public class PartTimeEmployee extends Employee {
    double workingHour;

    PartTimeEmployee(String name, int id, double workingHour){
        super(name, id);
        if(workingHour < 0){
            throw new IllegalArgumentException("Working hour cannot be negative!");
        }
        this.workingHour = workingHour;
    }

    @Override
    double calculateSalary(){
        return workingHour * 300;
    }

    @Override
    double calculateBonus(){
        return calculateSalary() * 5 /100;
    }
}
