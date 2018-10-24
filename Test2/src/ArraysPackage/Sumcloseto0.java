package ArraysPackage;

public class Sumcloseto0 {

	public static void main(String[] args) {

		int[] ar  = {1,2,3,4,5};
		findSum(ar);
		
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
