package javaConcepts;

public class Overload {

//	public int fo(int a)
//	{
//		return 1;
//	}
	
	public static int fo(int a)
	{
		return 1;
	}
	
	
	public static double fo(int a,int b)
	{
		return 'a';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload o = new Overload();		
		System.out.println(o.fo(1));
				
		A ob = new B();
		ob.temp();
		ob.test();
		
		System.out.println(ob.tes());
	}
	
}


class A
{
	public static void temp()
	{
		System.out.println("a temp");
	}	
	
	
//	public int tes()
//	{
//		return 1;
//	}
	
	public void test()
	{
		System.out.println("test 22  ");
	}
	public int tes()
	{
		return 1;
	}
}

class B extends A
{
	public static void temp()
	{
		System.out.println(" b temp");
	}
	
	
//	public float tes()
//	{
//		return (float) 1.0;
//	}
	
	public int tes(int a)
	{
		return 1;
	}
}
