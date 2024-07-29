public class Rectangle {
	 int length;
	 int width;
	
	public static void main(String[] args) {
		Rectangle newRectangle = new Rectangle();
		newRectangle.length = 10;
		newRectangle.width = 15;
		
		int perimeter = 2 * (newRectangle.length + newRectangle.width);
		int area = newRectangle.width * newRectangle.length;
		
		System.out.println("perimeter = " + perimeter);
		System.out.println("area = " + area);
	}

}
