package employee;

public class Manager extends Employee{

	public Manager(double salary) {
		super(salary);
	}

	@Override
	public double calcSalary() {
		double managerSalary = salary + (salary / 5);
		System.out.println("Manager salary =  " + managerSalary);
		return managerSalary;
	}

}
