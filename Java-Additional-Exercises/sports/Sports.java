package sports;

abstract class Sports {

	abstract public String play();

	public static void main(String[] args) {
		Sports football = new Football();
		football.play();
		
		Sports basketball = new Basketball();
		basketball.play();
		
		Sports rugby = new Rugby();
		rugby.play();
	
	}

}
