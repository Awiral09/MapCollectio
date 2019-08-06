import java.util.HashSet;

public class Company {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(201, "Rohan", "Management", 50000));
        employees.add(new Employee(187, "Rahul", "IT", 30000));
        employees.add(new Employee(97, "Raj", "Banker", 50000));
        employees.add(new Employee(141, "Ramesh", "CA", 35000));
        employees.add(new Employee(75, "Rohit", "Management", 54000));
        System.out.println(employees);


    }
}
