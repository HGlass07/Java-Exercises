package employee;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void calculateService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);

        System.out.println("Service Length: " +
            period.getYears() + " years, " +
            period.getMonths() + " months, and " +
            period.getDays() + " days.");
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam Smith", 32000, LocalDate.of(2005, 5, 25));
        employee1.calculateService();
        employee1.displayEmployeeDetails();
    }
}