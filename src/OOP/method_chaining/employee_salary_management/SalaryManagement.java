package OOP.method_chaining.employee_salary_management;

public class SalaryManagement {
    public static void main(String[] args){
        Employee e1 = new Employee("Snaho", 67000);

        e1.increaseSalary(5000).increaseSalary(2000).deductSalary(1000).displayInfo();
    }
}
