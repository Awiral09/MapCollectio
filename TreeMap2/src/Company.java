import java.util.TreeSet;

public class Company {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee(201, "Rahul", "Management", 50000));
        employees.add(new Employee(201, "Rahul", "IT", 30000));
        employees.add(new Employee(201, "Rahul", "Management", 50000));
        employees.add(new Employee(201, "Rahul", "Management", 35000));
        employees.add(new Employee(203, "Rahul", "Management", 54000));
        System.out.println(employees);


    }
}
