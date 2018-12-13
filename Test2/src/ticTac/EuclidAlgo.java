package ticTac;

public class EuclidAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = findGcd2(63, 14);
		System.out.println(a);
	}
	
	
	
	public static int findGcd2(int m, int n)
	{
		
		if(m<n)
		{
			int tmp =m;
			m=n;
			n=tmp;
		}
		
		if(m%n==0)
		{
			return n;
		}
		else
		{
			int rem = m%n;
			return findGcd2(n, rem);
		}
		
		
	}
	
	public static int findGcd(int m, int n)
	{
		
		if(m<n)
		{
			int tmp =m;
			m=n;
			n=tmp;
		}
		
		if(m%n==0)
		{
			return n;
		}
		
		int diff= m-n;
		return findGcd(diff, n);
//		if(diff>n)
//		{
//			return findGcd(diff, n);
//						
//		}
//		else
//		{
//			return findGcd(n, diff);
//		}
		
	}

}
