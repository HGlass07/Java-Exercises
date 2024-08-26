package shape2;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double calcPerimeter() {
		return 3 * side;
	}
	public double calcArea() {
		return (Math.sqrt(3) / 4) * (side * side);
	}

}
