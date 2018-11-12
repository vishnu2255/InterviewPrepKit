package ArraysPackage;

public class FindMinInSortedRotArraY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {7,8,9,5,6};
		
		System.out.println(findmin(ar, 0, ar.length-1));
//		findmin(ar, 0, ar.length-1);
		
	}
	
	public static int findmin(int[] ar,int low,int high)
	{
		if(low>high)
		{
			return ar[low];
		}
		
		if(low ==high)
		{
			return ar[low];
		}
		
		
		int mid= low+(high-low)/2;
		
		
		if(mid<high && ar[mid+1] < ar[mid])
		{
			System.out.println(" found at "+ (mid+1)+" ele is "+ ar[mid+1]);
		}
		
		if(mid>low && ar[mid] < ar[mid-1])
		{
			System.out.println(" found at "+ mid+" ele is "+ ar[mid]);
		}
		
		if(ar[mid] < ar[high])
		{
			return findmin(ar, low, mid-1);
		}
		
		return findmin(ar, mid+1, high);
		
	}
}
