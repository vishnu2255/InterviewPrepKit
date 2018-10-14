package ArraysPackage;

public class MaxDiffinEles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {4,3,15,2,92,1,6};
		maxDiff(ar);
	}
	
	public static void maxDiff(int[] ar)
	{
		int min = ar[0];
		int curr_diff = 0;
		
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min = ar[i];				
			}
			else
			{
				int diff = ar[i] - min;
				if(diff>curr_diff)
				{
					curr_diff = diff ; 
				}
			}
			
		}
		
		System.out.println(curr_diff);
	}

}
