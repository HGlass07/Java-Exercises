package pet;

public class Dog extends Pet{
	private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    @Override
    public int calcAgeInHumanYears() {
        // assuming first 2 years = 10.5 human years each, after that = 4 human years per year
        int dogAge = getAge();
        if (dogAge <= 2) {
            return (int) (dogAge * 10.5);
        } else {
            return 21 + (dogAge - 2) * 4;
        }
    }
}
