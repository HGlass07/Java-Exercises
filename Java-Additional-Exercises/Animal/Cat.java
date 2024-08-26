package Animal;

public class Cat extends Animal{
	
	public Cat(String sound) {
		super(sound);
	}
	
	@Override
	public void displaySound() {
		System.out.println("Cat sound set to: " + sound);
	}

}
