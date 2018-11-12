package ArraysPackage;

import java.util.Arrays;

public class SortandRotatedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {15 ,16 ,19 ,20 ,25,0,1, 3, 4, 5, 7, 10, 14 };
//		int[] ar = {12,13,14,15,1,2,3 };
		//int pi = findPivot(ar, 0, ar.length-1);
		
		//System.out.println(pi);
		
//		int el = search(1, ar, 0, ar.length-1);
		
//		System.out.println("element found at :"+ el);
		
		
//		int cnt = finsumPairs(4,ar, 0, ar.length);
//		
//		System.out.println("no of pairs with the given sum is "+cnt);
		
		
		rearrange();
		
	}
	
	public static void rearrange()
	{
		int[] ar = {5,0,4,3,1,2};
		System.out.println(Arrays.toString(ar));
		int n =ar.length;
		
		for(int i=0;i<ar.length;i++)
		{
			int tmp = ar[ar[i]];
			
			ar[i] = ar[i] + (tmp%n)*n;
		}				
		
		System.out.println(Arrays.toString(ar));
		
		for(int i=0;i<ar.length;i++)
		{					
			ar[i] = ar[i]/n;
		}
		
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static int finsumPairs(int sum,int[] arr,int left,int ryt)
	{
		int pivot = findPivot(arr, left, ryt);
		System.out.println(pivot);
		
		int low = pivot+1;
		int high = pivot;
		int n = arr.length;
		int cnt=0;
		
		while(low!=high)
		{
			int tmpSum = arr[low]+arr[high];
			if( tmpSum == sum)
			{
				cnt++;
				
				if((n+high-1)%n == low)
				{
					return cnt;
				}
				low = (low+1)%n;
				high = (n+high-1)%n;
				
			}
			else if(tmpSum<sum)
			{
				low = (low+1)%n;
			}
			else
			{
				high = (n+high-1)%n;
			}
			
		}
		return cnt;
	}
	
	public static int search(int data,int[] arr,int left,int ryt)
	{
		int pivot = findPivot(arr, left, ryt);
		System.out.println(pivot);
		if(data > arr[left])
		{
			ryt = pivot;
		}
		else
		{
			left = pivot+1;
		}
		
		while(left<=ryt)
		{
			int mid = (left+ryt)/2;
			if(arr[mid] == data)
			{
				return mid;
			}
			if(arr[mid] > data)
			{
				ryt = mid-1;
			}
			else
			{
				left = mid+1;
			}
			
		}
		return -1;
	}
	
	public static int findPivot(int[] arr,int left,int ryt)
	{
		if(left<=ryt)
		{
			
		int mid = (left+ryt)/2;
		
		if(mid<ryt && arr[mid] > arr[mid+1])
		{
			return mid;			
		}
		
		if(mid>left  && arr[mid-1]>arr[mid])
		{
			return mid-1;
		}
		
		if(arr[left]<arr[mid])
		{
			return findPivot(arr, mid+1, ryt);
		}
		else
		{
			return findPivot(arr, left, mid-1);
		}
		
		}
		
		return -1;
	}

}
