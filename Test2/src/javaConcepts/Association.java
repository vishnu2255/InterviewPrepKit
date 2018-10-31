package javaConcepts;

class test
{

	static {
		
		System.out.println("static block");
	}
	test()
	{
		System.out.println("constructor called ");
	}
	int b;
	static void test()
	{
		int a;
		//b = 10;
		
	}
}

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t = new test();
		
		
		
		Engine e= new Engine();
				
		//Aggregation
		Car c1= new Car(e);		
		c1.work();
				
		//Composition
		
		Car c2 = new Car();
		c2.work();
		
	}	
}

class Engine
{
	
	public void work()
	{
		System.out.println("Engine Work started : ");
	}
}


class Car
{

	private Engine eng;
	
//	private final Engine eng;
Car(Engine e)
{
	this.eng = e; 
}

Car()
{
	
this.eng = new Engine();
}

public void work()
{

//eng.work();
	
	if(this.eng!=null)
	{
		eng.work();
		System.out.println("car working ");		
	}

}

}