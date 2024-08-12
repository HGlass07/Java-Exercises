package pet;

public abstract class Pet {
	private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void displayPetDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }
    public abstract int calcAgeInHumanYears();


	public static void main(String[] args) {
        Dog dog = new Dog("Basil", 7, "Toy Duck");
        dog.displayPetDetails();
        System.out.println("Age in Human Years: " + dog.calcAgeInHumanYears());
        System.out.println();

        Bird bird = new Bird("Scratch", 3, 25.6);
        bird.displayPetDetails();
        System.out.println("Age in Human Years: " + bird.calcAgeInHumanYears());
    }

	}


