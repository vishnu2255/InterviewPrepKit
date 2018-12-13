package greedyAlgos;

public class HeapSort {
	
	private static int[] arr;
	private static int heap_size;	
	
	public static void constructHeap()
	{
		for(int i=heap_size/2-1;i>=0;i--)
		{
			
		}
	}
	
	
	public static void heapSort(int[] a)
	{
		arr = a;
		heap_size = a.length;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 5, 4, 3, 5, 2, 1};
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}

	}

}
