package javaConcepts;

enum Color
{
	RED,GREEN,YELLOW;
}


enum TrafficSig
{

RED("STOP"),GREEN("GO"),YELLOW("READY");
	
	private String val;
	
	public String get()
	{
		return this.val;
	}
	
	private TrafficSig(String val)
	{
	this.val = val;		
	}

}


class test2
{

private test2()
{
	System.out.println("test2");
}

}

public class Test_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test2 t = new test2();
		
		//TrafficSig trs = new TrafficSig("te");
		
		Color c1 = Color.GREEN;		
		System.out.println(c1);
		
		Color[] val = Color.values();
		
		for(Color c : val)
		{
			System.out.println(c+ " , "+ c.ordinal());
		}
		
		
		TrafficSig[] tr = TrafficSig.values();
		
		for(TrafficSig a : tr)
		{
			System.out.println(a.name()+" , "+ a.get());
		}
		
				
	}

}
