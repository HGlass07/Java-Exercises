package shape;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		double area = Math.PI * (radius * radius);
		System.out.println("Circle area =  " + area);
		return area;
	}
}
