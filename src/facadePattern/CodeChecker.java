package facadePattern;

public class CodeChecker {

	private int code = 12;
	
	public int getCode() {return code;}
	
	public boolean isCodeValid(int code)
	{
		if(code == getCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
}
