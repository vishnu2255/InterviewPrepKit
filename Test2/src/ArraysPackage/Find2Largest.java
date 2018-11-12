package ArraysPackage;

public class Find2Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5,6,7};
		System.out.println(secondLargest(ar));
		
	}
	
	public static int secondLargest(int[] ar)
	{
		int first = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>first)
			{
				sec = first;
				first = ar[i];
			}
			
			if(ar[i]>sec && ar[i]<first)
			{
				sec = ar[i];
			}
		}
		
		System.out.println(" first & sec is"+ first+" , "+ sec);
		return sec;
	}

}
