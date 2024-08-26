package shape2;

abstract class Shape {
	
	public abstract double calcArea();
	public abstract double calcPerimeter();

	public static void main(String[] args) {
		Circle circle1 = new Circle(6);
		double circPerimeter1 = circle1.calcPerimeter();
		System.out.println("Circle 1 perimeter: " + circPerimeter1);
		double circArea1 = circle1.calcArea();
		System.out.println("Circle 1 area: " + circArea1);
		
		Rectangle rectangle1 = new Rectangle(5, 8);
		double rectanglePerimeter1 = rectangle1.calcPerimeter();
		System.out.println("Rectangle 1 perimeter: " + rectanglePerimeter1);
		double rectangleArea1 = rectangle1.calcArea();
		System.out.println("Rectangle 1 area: " + rectangleArea1);
		
		Triangle triangle1 = new Triangle(10);
		double trianglePerimeter1 = triangle1.calcPerimeter();
		System.out.println("Triangle 1 perimeter: " + trianglePerimeter1);
		double triangleArea1 = triangle1.calcArea();
		System.out.println("Triangle 1 area: " + triangleArea1);
		
	}

}
