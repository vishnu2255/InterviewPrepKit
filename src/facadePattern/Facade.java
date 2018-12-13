package facadePattern;

public class Facade {

	private int acntNum ;
	private int code ;
	
	AccountChecker ac;
	CodeChecker cc;
	FundsChecker fc;
	
	Facade(int a,int c)
	{
		this.acntNum =a;
		this.code = c;
		
		ac = new AccountChecker();
		cc  = new CodeChecker();
		fc = new FundsChecker();
		
	}
	
	public void withdraw(double w)
	{
		if(ac.isAcntValid(this.acntNum) && cc.isCodeValid(code) && fc.hasSuffFunds(w))
		{
			fc.withdraw(w);
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("FAIL");
		}			
	}
	
	public void deposit(double d)
	{
		if(ac.isAcntValid(this.acntNum) && cc.isCodeValid(code))
		{
			fc.deposit(d);
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}
	
	
}
