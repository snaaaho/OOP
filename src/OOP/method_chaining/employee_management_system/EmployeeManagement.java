package OOP.method_chaining.employee_management_system;

public class EmployeeManagement {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setDetails("Snaho", "1829", 70000);
        Employee e2 = new Employee();
        e2.setDetails("Abid", "1892", 65000);

        e1.increaseSalary(5000).displayInfo();
        e2.increaseSalary(5000).increaseSalary(2000).displayInfo();
    }
}
