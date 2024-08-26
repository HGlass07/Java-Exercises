package Animal;

public class Bird extends Animal{
	
	public Bird(String sound) {
		super(sound);
	}
	
	@Override
	public void displaySound() {
		System.out.println("Bird sound set to: " + sound);
	}

}
