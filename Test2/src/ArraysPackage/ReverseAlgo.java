package ArraysPackage;

public class ReverseAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {};
		int d =2;
		rotate(ar,0,1);
		rotate(ar,2,ar.length-1);
		rotate(ar,0,ar.length-1);
		
	}

	public static void rotate(int[] ar,int a,int b)
	{
		while(a<b)
		{
			int tmp = ar[b];
			ar[b] = ar[a];
			ar[a] = tmp;
			
			a++;
			b--;
			
		}
		
	}
}
