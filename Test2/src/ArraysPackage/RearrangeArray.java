package ArraysPackage;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {3,1,0,2,4};
		
		for(int i=0;i<ar.length;i++)
		{
			int tmp = ar[ar[i]];
			ar[i] =ar[i] + (tmp%ar.length)*ar.length;
			
		}		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = ar[i]/ar.length;
			System.out.println(ar[i]);
		}		
		
	}

}
