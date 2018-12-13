package facadePattern;

public class AccountChecker {

	private int acntNum = 100;
	
	public int getAcnt()
	{
		return acntNum;
	}
	
	public boolean isAcntValid(int acnt)
	{
		if(acnt == getAcnt())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
