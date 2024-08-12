package Shape;

public class Triangle {
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
	
	public double calcTrianglePerimeter() {
		return 3 * side;
	}
	public double calcTriangleArea() {
		return (Math.sqrt(3) / 4) * (side * side);
	}
	

}
