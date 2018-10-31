package javaConcepts;

public class SwapObj {
	
	public static void test(SwapObj s)
	{
		s.a = 120;
	}
	
	int a;
	
	public static void swap(SwapObj a, SwapObj b)
	{
		SwapObj tmp = a;
		a=b;
		b=tmp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SwapObj a = new SwapObj();
	a.a =100;
	
	SwapObj b = new SwapObj();
	b.a =10;
	
	System.out.println(a.a);
//	test(a);
	
	System.out.println(b.a);
	
	swap(a,b);
	
	System.out.println(a.a);
//	test(a);
	
	System.out.println(b.a);
	
	
	
	
	}

}
