package designPatterns;

public class Singleton {

	private static Singleton instance;
	private int a=1;
	private Singleton()
	{
		
	}
	
	static Singleton getInstance()
	{
		if(instance == null)
		{
		  instance  =  new Singleton();	
		}
		return instance;
	}
	
	 int getNum()
	{
		return a++;
		
	}
	
	
	
	
}
