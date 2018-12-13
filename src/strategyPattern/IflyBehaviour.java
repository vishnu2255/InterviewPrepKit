package strategyPattern;

public interface IflyBehaviour {

	public void fly();
}

class Canfly implements IflyBehaviour
{
	
	public void fly() {
		
		System.out.println("can fly");		
	}	
}

class Cantfly implements IflyBehaviour
{
	public void fly() {
		System.out.println("cant fly");	
	}	
}


