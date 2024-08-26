package shape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calcArea() {
		double area = length * width;
		System.out.println("Rectangle area =  " + area);
		return area;
	}

}