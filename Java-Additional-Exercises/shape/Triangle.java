package shape;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double calcArea() {
		double area = (Math.sqrt(3) / 4) * (side * side);
		System.out.println("Triangle area =  " + area);
		return area;
	}
}
