package OOP.Upcasting_downcasting.employee_management;

public class Main {
    public static void main(String[] args){
        //upcasting:  referance parent & object child
        Employee e = new Developer();
        e.work();
        //e.code();     //error debe, cuz referance e code method nai.

        //downcasting:  child -> parent
//        Developer d = (Developer) e;
//        d.code();                   // eta kaj korbe, but instanceof use kora better. karon je class e object ache, oi class na use korle error asbe.

        if(e instanceof Developer){
            Developer d = (Developer) e;
            d.code();
        }
        else{
            System.out.println("This is not a Developer object");
        }

        Employee a = new Tester();
        a.work();
        if(a instanceof Tester){
            Tester b = (Tester) a;
            b.test();
        }
        else{
            System.out.println("This is not a Tester object");
        }
    }
}
