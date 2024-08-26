package employee;

abstract class Employee {
	protected double salary;
	
	public Employee(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public abstract double calcSalary();
	
	public static void main(String[] args) {
		Employee manager1 = new Manager(60000);
		manager1.calcSalary();
		
		Employee programmer1 = new Programmer(50000);
		programmer1.calcSalary();

	}

}
