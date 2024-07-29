// example of getting and setting
public class Dog {
	
	//attributes of Dog class
	private String dogName;
	private String dogBreed;
	
	//constructor
	public Dog(String name, String breed) {
        this.dogName = name;
        this.dogBreed = breed;
    }
	
	//getters
	public String getName() {
		return dogName;
	}
	
	public String getBreed() {
		return dogBreed;
	}
	
	//setters
	public void setName(String newName) {
	    this.dogName = newName;
	  }
	
	public void setBreed(String newBreed) {
	    this.dogBreed = newBreed;
	  }
	
	

	public static void main(String[] args) {
		Dog dog1 = new Dog("Trevor", "Labrador");
		Dog dog2 = new Dog("Mike", "Poodle");
		
		//initial values printed
		System.out.println("Dog 1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", " + dog2.getBreed());
		
		
		//attributes modified
		dog1.setName("Bill");
		dog1.setBreed("Spaniel");
		
		dog2.setName("Chuck");
		dog2.setBreed("Mastiff");
		
		//new attributes printed
		System.out.println("Updated Dog 1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Updated Dog 2: " + dog2.getName() + ", " + dog2.getBreed());
		
	}

}