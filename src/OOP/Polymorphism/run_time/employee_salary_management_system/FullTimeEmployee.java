package OOP.Polymorphism.run_time.employee_salary_management_system;

public class FullTimeEmployee extends Employee {
    double salary = 50000;

    FullTimeEmployee(String name, int id){
        super(name, id);
    }

    @Override
    double calculateSalary(){
        return salary;
    }

    @Override
    double calculateBonus(){
        return salary * 10 / 100;
    }
}
