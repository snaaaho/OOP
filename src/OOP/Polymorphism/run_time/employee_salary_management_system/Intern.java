package OOP.Polymorphism.run_time.employee_salary_management_system;

public class Intern extends Employee {
    double salary = 15000;
    Intern(String name, int id){
        super(name, id);
    }

    @Override
    double calculateSalary(){
        return salary;
    }

    @Override
    double calculateBonus(){
        return salary * 2 / 100;
    }
}
