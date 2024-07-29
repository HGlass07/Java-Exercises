
public class Circle {
	
	private double radius;
	
	public Circle(double circRadius) {
		this.radius = circRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
        this.radius = newRadius;  // Update the radius attribute
    }
	
	public double calculateArea() {
		return Math.PI * (radius * radius);
	}
	
	public double calculateCircumferance() {
		return 2 * (Math.PI * radius); 
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle(13);
		
		System.out.println("Circle area = " + circle1.calculateArea());
		System.out.println("Circle circumferance = " + circle1.calculateCircumferance());
		
		circle1.setRadius(47);
		
		System.out.println("Circle area = " + circle1.calculateArea());
		System.out.println("Circle circumferance = " + circle1.calculateCircumferance());
		
	}

}
