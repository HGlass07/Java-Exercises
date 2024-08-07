package TrafficLight;

public class TrafficLight {
	private String colour;
	private int duration;
	
	public TrafficLight(String colour, int duration) {
		this.colour = colour;
		this.duration = duration;
	}
	
	public String getColour() {
		return colour;
	}
	public int getDuration() {
		return duration;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void changeColor(String newColour) {
        this.colour = newColour;
        System.out.println("Colour changed to " + newColour);
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(colour);
    }

    public boolean isGreen() {
        return "green".equalsIgnoreCase(colour);
    }
	

	public static void main(String[] args) {
		TrafficLight light = new TrafficLight("red", 60);

        System.out.println("Initial Colour: " + light.getColour());
        System.out.println("Initial Duration: " + light.getDuration() + " seconds");

        light.changeColor("green");

        System.out.println("Is the light red? " + light.isRed());
        System.out.println("Is the light green? " + light.isGreen());

	}

}
