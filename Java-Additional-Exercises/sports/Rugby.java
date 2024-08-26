package sports;

public class Rugby extends Sports{
	
	public Rugby() {
	}
	
	@Override
	public String play() {
		String statement = "Now playing rugby";
		System.out.println(statement);
		return statement;
	}
	
}
