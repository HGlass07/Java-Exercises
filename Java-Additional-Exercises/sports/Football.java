package sports;

public class Football extends Sports{
	
	public Football() {
	}
	
	@Override
	public String play() {
		String statement = "Now playing football";
		System.out.println(statement);
		return statement;
	}
	
}

	
