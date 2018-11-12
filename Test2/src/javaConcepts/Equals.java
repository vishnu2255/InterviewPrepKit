package javaConcepts;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("ABCD");
		String s2=new String("ABCD");
		
		if(s1==s2)
		{
			System.out.println(" s1 equal s2");
		}
		else
		{
			System.out.println("s1 not +/ s1");
			
		}
		
		if(s1.equals(s2))
		{
			System.out.println("object equal  ");
		}
		else
		{
			System.out.println("object not equal");
		}
		
	}

}
