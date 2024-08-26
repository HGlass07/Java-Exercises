package vehicle;

public class Car extends Vehicle{
	
	public Car(int speed) {
		super(speed);
	}
	
	@Override
	public void speedUp() {
		System.out.println("Car speed set to: " + speed + " mph");
	}
}