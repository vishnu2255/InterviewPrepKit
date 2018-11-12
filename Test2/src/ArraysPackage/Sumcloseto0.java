package ArraysPackage;

public class Sumcloseto0 {

	public static void main(String[] args) {

		int[] ar  = {-1,2,3,-4,5};
//		findSum(ar);
		
		sum(ar);
		
	}
	//sorted array
	public static void sum(int[] ar)
	{
		int low=0;
		int high = ar.length-1;
		int tmp = 0;
		int dif = Integer.MAX_VALUE;
		int min=0,max=0 ;
		while(low<high)
		{
			tmp = ar[low]+ ar[high];
			
			if(Math.abs(tmp)< dif)
			{
				dif = tmp ;
				min =low;
				max =high;
			}
			
			if(tmp>0)
			{
				low++;
			}
			else
			{
				high--;
			}			
		}
		
		System.out.println("indices are "+min+" , "+ max);
		
	}
	
	public static void findSum(int[] arr)
	{
		int curr_sum = Integer.MAX_VALUE;
		int l=0,r=arr.length-1;
		int minlind = 0,minrind=0;
		
		while(l<r)
		{
		int tm = arr[l] + arr[r];
		
		if(Math.abs(tm)< Math.abs(curr_sum))
		{
			curr_sum = tm ;		
			minlind = l;
			minrind = r;
		}		
		if(tm<0)
		{
			l++;
		}
		else
		{
			r--;
		}
		
		}
		
		System.out.println("indices "+minlind+" , "+minrind);
		
	}

}
