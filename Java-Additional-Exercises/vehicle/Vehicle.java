package vehicle;

public class Vehicle {
	protected int speed;
	
	public Vehicle(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void speedUp() {
		System.out.println("Speed set to: " + speed + " mph");
	}

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(30);
		vehicle1.speedUp();
		
		Vehicle bike1 = new Bike(25);
		bike1.speedUp();
		
		Vehicle car1 = new Car(50);
		car1.speedUp();

	}

}
