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
	
	
	public static int fo(int a,int b)
	{
		return 'a';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload o = new Overload();
		
		System.out.println(o.fo(1));
		
		
		A ob = new B();
		ob.temp();
	}
	
}


class A
{
	public static void temp()
	{
		System.out.println("a temp ");
	}	
}

class B extends A
{
	public static void temp()
	{
		System.out.println(" b temp");
	}
}
