package decoratorPatterN;

public class Cheese extends DecoratorClass  {

	Cheese(Pizza pi) {
		super(pi);				
	}
	
	public String getDescription()
	{
	  return temp.getDescription() + ", Cheese";
	}
	public double getCost()
	{
		return temp.getCost() + 2.0;
	}

}
