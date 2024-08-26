package shape2;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public double calcArea() {
		double area =  2 * (Math.PI * radius);
		return area;
	}
	public double calcPerimeter() {
		return Math.PI * (radius * radius);
	}
}


