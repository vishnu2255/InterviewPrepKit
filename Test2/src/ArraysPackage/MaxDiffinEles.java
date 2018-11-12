package ArraysPackage;

public class MaxDiffinEles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {4,3,15,2,92,1,6,100};
//		maxDiff(ar);
		minDiff(ar);
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

	public static void minDiff(int[] ar)
	{
		int max = ar[0];
		int diff=Integer.MIN_VALUE;
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
			else
			{
				int curdiff = max - ar[i];
				if(curdiff>diff)
				{
					diff = curdiff;
				}
			}
		}
		
		System.out.println(" min diff is"+ diff +" max ele is : "+ max);
		
	}		
}
