package decoratorPatterN;

public abstract class DecoratorClass implements Pizza  {

	protected Pizza temp;
	
	DecoratorClass(Pizza pi)
	{
		temp = pi;
	}
	public String getDescription()
	{
	  return temp.getDescription();
	}
	public double getCost()
	{
		return temp.getCost();
	}
}
