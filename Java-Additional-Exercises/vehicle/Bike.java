package vehicle;

public class Bike extends Vehicle{
	
	public Bike(int speed) {
		super(speed);
	}
	
	@Override
	public void speedUp() {
		System.out.println("Bike speed set to: " + speed + " mph");
	}
}
