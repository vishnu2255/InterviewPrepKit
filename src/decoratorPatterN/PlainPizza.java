package decoratorPatterN;

public class PlainPizza implements Pizza{

	public String getDescription() {
				
		return "adding dough";
	}

	public double getCost() {
	
		return 10.00;
	}
	
	

}
