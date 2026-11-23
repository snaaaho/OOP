package OOP.Polymorphism.run_time.employee_salary_management_system;

public class Main {
    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee("Snaho", 1829);
        Employee e2 = new PartTimeEmployee("Abid", 1928, 100);
        Employee e3 = new Intern("Fahim", 1289);

        e1.displayInfo();
        System.out.println("------------------------------------------------------");
        e2.displayInfo();
        System.out.println("------------------------------------------------------");
        e3.displayInfo();
        System.out.println("------------------------------------------------------");
    }
}
