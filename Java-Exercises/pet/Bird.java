package pet;

public class Bird extends Pet{
	private double wingSpan; 

    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Wing Span: " + wingSpan + " cm");
    }

    @Override
    // assuming a budgie, as an example
    public int calcAgeInHumanYears() {
        return getAge() * 9;
    }

}
