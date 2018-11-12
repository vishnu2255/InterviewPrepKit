package heapPack;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {100,5,4,200,3,901,6};
		
//		buildHeap(ar, ar.length);
		
//		findKLargest(3, ar);
		
//		heapSort(ar);
		System.out.println(Arrays.toString(ar));
		
		changevalue(ar, 3, 1);
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void changevalue(int[] ar,int ind,int val)
	{
		if(ar[ind]>val)
		{
			ar[ind] = val;
			percolateUp(ar, ind);	
		}				
	}
	
	public static void percolateUp(int[] ar,int i)
	{
		if(i<0)
		{
			return;
		}
		
		while(i>0 && ar[(i-1)/2]>ar[i])
		{
			int temp = ar[(i-1)/2];
			ar[(i-1)/2] = ar[i];
			ar[i] = temp;
			i=(i-1)/2;
		}
	}
	
	public static void heapSort(int[] ar)
	{
		int size = ar.length;
		buildHeap(ar, size);
		
		for(int i=size;i>0;i--)
		{
			int tmp = ar[0];
			ar[0] = ar[size-1];
			ar[size-1] = tmp;
			
			size--;
			
			minHeap(0, ar, size);
			
		}
		
	}
	
	public static void findKLargest(int n,int[] ar)
	{
		buildHeap(ar, n);
		
		for(int i=n;i<ar.length;i++)
		{
			if(ar[i]>ar[0])
			{
				ar[0] = ar[i];
				minHeap(0, ar, n);
			}						
		}
		
		System.out.println(ar[0]);
	}
	
	public static void buildHeap(int[] ar,int size)
	{
		for(int i=(size/2-1);i>=0;i--)
		{
			minHeap(i, ar,size);
		}
		
	}
	
	public static void maxHeap(int i,int[] arr, int size)
	{
		int high = i;
		int left = 2*i+1;
		int ryt =  2*i+2;
		
		if(left < size && arr[left]>arr[high])
		{
			high = left;
		}
		
		if(ryt < size && arr[ryt]>arr[high])
		{
			high = ryt;
		}
		
		if(high!=i)
		{
			int tmp = arr[i];
			arr[i]  = arr[high];
			arr[high] = tmp;
			
			maxHeap(high, arr, size);
		}
	}
	
	public static void minHeap(int i,int[] ar,int size)
	{
		int low = i;
		int left = 2*i+1;
		int ryt  = 2*i+2;
		
		if(left<size &&  ar[left]<ar[low])
		{
			low = left;
		}
		
		if(ryt<size && ar[ryt]<ar[low])
		{
			low = ryt;
		}
		
		if(low!=i)
		{
			int temp = ar[low];
			ar[low]  = ar[i];
			ar[i]    = temp;			
			minHeap(low, ar,size);
		}
//		minHeap(low, ar,size);
	}

}
