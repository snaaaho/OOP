package OOP.Encapsulation.employee_salary;

public class EmployeeManagement {
    public static void main(String[] args){
        Employee e1 = new Employee("Abid", 30000);

        e1.displayInfo();
        e1.setName("Snaho");
        e1.increaseSalary(5000).increaseSalary(2000).deductSalary(1000).displayInfo();
        System.out.println("Employee Name: " + e1.getName());
        System.out.println(e1.getName() + "'s salary is: " + e1.getSalary());
    }
}
