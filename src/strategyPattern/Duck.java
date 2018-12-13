package strategyPattern;

public class Duck {

	protected IflyBehaviour flybeh;
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	public void tofly()
	{
		flybeh.fly();
	}
	
	public void display()
	{
		System.out.println("name is "+ this.name);
	}
	
}


class DuckA extends Duck
{
	public DuckA()
	{
		//super();
		flybeh = new Canfly();
	}
	
	
}

class DuckB extends Duck
{
	public DuckB()
	{
		//super();
		flybeh = new Cantfly();
	}
		
}