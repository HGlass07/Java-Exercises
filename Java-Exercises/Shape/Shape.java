package Shape;

abstract class Shape {
	
	public abstract double calcCirclePerimeter();
	public abstract double calcCircleArea();
	
	public abstract double calcRectanglePerimeter();
	public abstract double calcRectangleArea();
	
	public abstract double calcTrianglePerimeter();
	public abstract double calcTriangleArea();
	
	
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
		double circPerimeter1 = circle1.calcCirclePerimeter();
		System.out.println("Circle 1 perimeter: " + circPerimeter1);
		double circArea1 = circle1.calcCircleArea();
		System.out.println("Circle 1 area: " + circArea1);
		
		Rectangle rectangle1 = new Rectangle(5, 5);
		double rectanglePerimeter1 = rectangle1.calcRectPerimeter();
		System.out.println("Rectangle 1 perimeter: " + rectanglePerimeter1);
		double rectangleArea1 = rectangle1.calcRectArea();
		System.out.println("Rectangle 1 area: " + rectangleArea1);
		
		Triangle triangle1 = new Triangle(5);
		double trianglePerimeter1 = triangle1.calcTrianglePerimeter();
		System.out.println("Triangle 1 perimeter: " + trianglePerimeter1);
		double triangleArea1 = triangle1.calcTriangleArea();
		System.out.println("Triangle 1 area: " + triangleArea1);
		
		
	}

}
