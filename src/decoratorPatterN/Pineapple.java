package decoratorPatterN;

public class Pineapple extends DecoratorClass {

	Pineapple(Pizza pi) {
		super(pi);
		
	}
	
	public String getDescription()
	{
	  return temp.getDescription() + ", Pineapple";
	}
	public double getCost()
	{
		return temp.getCost() + 5.0;
	}
	
	

//	Pineapple(Pizza pi) {
//		super(pi);
//		
//		
//	}


}
