package sports;

public class Basketball extends Sports{
	
	public Basketball() {
	}
	
	@Override
	public String play() {
		String statement = "Now playing basketball";
		System.out.println(statement);
		return statement;
	}
	
}
