package shape2;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.length = width;
	}
	
	@Override
	public double calcPerimeter() {
		return (2 * length) + (2 * width);
	}
	public double calcArea() {
		return length * width;
	}

}
