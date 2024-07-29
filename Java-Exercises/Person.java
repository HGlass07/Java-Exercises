public class Person {
	
	String fname;
	int age;
			

	public static void main(String[] args) {
		Person Barry = new Person();
		Barry.fname = "Barry";
		Barry.age = 47;
		System.out.println("Name:" + Barry.fname);
		System.out.println("Age:" + Barry.age);
		
		Person Linda = new Person();
		Linda.fname = "Linda";
		Linda.age = 28;
		System.out.println("Name:" + Linda.fname);
		System.out.println("Age:" + Linda.age);

	}

}