package Animal;

public class Animal {
	protected String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void displaySound() {
		System.out.println("Sound set to: " + sound);
	}

	public static void main(String[] args) {
		Animal animal1 = new Animal("bark");
		animal1.displaySound();
		
		Animal cat1 = new Cat("meow");
		cat1.displaySound();
		
		Animal bird1 = new Bird("tweet");
		bird1.displaySound();

	}

}
