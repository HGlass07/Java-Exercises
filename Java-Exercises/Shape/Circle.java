package Shape;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcCirclePerimeter() {
		return 2 * (Math.PI * radius);
	}
	public double calcCircleArea() {
		return Math.PI * (radius * radius);
	}
	
}
