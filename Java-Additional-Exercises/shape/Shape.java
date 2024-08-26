package shape;

abstract class Shape {
	
	public abstract double calcArea();

	public static void main(String[] args) {
		Shape circle1 = new Circle(5);
		circle1.calcArea();
		
		Shape rectangle1 = new Rectangle(5, 4);
		rectangle1.calcArea();
		
		Shape triangle1 = new Triangle(6);
		triangle1.calcArea();
	}

}
