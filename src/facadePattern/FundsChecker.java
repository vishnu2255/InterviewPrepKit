package facadePattern;

public class FundsChecker {

	private double amnt = 1000 ;
	
	public double getAmnt() {return amnt; }
	
	public void deposit(double am)
	{
		amnt += am;
		System.out.println("Current Bal : "+ amnt);
	}

	public boolean hasSuffFunds(double a)
	{
		if(a>amnt)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void withdraw(double am) {
		
		if(am> amnt)
		{
			System.out.println("insufficient funds");
			
		}
		else
		{
			amnt -= am;
			System.out.println("Current Bal : "+ amnt);

		}
	}
	
}
