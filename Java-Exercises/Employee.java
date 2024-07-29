import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    private List<Employee> employees = new ArrayList<>();

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String name) {
        employees.removeIf(emp -> emp.getName().equals(name));
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void applyRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', jobTitle='" + jobTitle + "', salary=" + salary + '}';
    }

    public static void main(String[] args) {
        Employee manager = new Employee("name", "job", 0);

        Employee emp1 = new Employee("Jack", "Manager", 30000);

        manager.addEmployee(emp1);

        System.out.println("Employee list:");
        manager.showEmployees();

        emp1.applyRaise(10);

        System.out.println("\nUpdated Employee list:");
        manager.showEmployees();
    }
}