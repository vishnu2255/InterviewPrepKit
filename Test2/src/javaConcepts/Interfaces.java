package javaConcepts;

public class Interfaces implements I1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 obj = new Interfaces();
		
		obj.show();
		
		obj.show2();
		I1.show3();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("child show method");
	}

}

interface I1
{
	
	public void show();
	
	default void show2()
	{
		System.out.println("default ");
	}
	
	static void show3()
	{
		System.out.println("show 3 ");
	}
}