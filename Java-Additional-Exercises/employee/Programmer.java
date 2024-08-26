package employee;

public class Programmer extends Employee{

	public Programmer(double salary) {
		super(salary);
	}

	@Override
	public double calcSalary() {
		double managerSalary = salary + (salary / 10);
		System.out.println("Programmer salary =  " + managerSalary);
		return managerSalary;
	}

}

