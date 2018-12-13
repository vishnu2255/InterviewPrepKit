package greedyAlgos;

public class Heap_algo {

	public int heap_length;
	public static Heap_algo al;
	public static void max_heapify(int A[] ,int n, int i)
	{
		
		int largest = i;
		int left = 2*i+1;
		int ryt = 2*i +2;
		
		if(left<n && A[left]>A[largest])
		{
			largest  =  left;
						
		}
		
		
		if(ryt<n && A[ryt]>A[largest])
		{
			largest = ryt;
		}
		
		
		if(largest!=i)
		{
			int tmp = A[i];
			A[i] = A[largest];
			A[largest] = tmp;
			max_heapify(A, n , largest);
		}
		
		
//		System.out.println(al.heap_length);				
	}
	
	public static void build_heap(int[] A)
	{		
		int n = A.length;
		//start from first non leaf node
		for(int i=n/2-1;i>=0;i--)
		{
		max_heapify(A,n, i);	
		}
					
		// extract max element from heap and replace it with last element and heapify it
		for(int i=n-1;i>=0;i--)
		{
		int tmp = A[0];
		A[0] = A[i];
		A[i] = tmp;
		max_heapify(A,i,0);		
		}		
		
	}
	
	public static void min_heapify(int[] A,int n, int i)
	{
		int min = i;
		int left = 2*i+1;
		int ryt  = 2*i+2;
		
		if(left<n && A[left]<A[min])
		{
			min = left;
		}
		
		if(ryt<n && A[ryt]<A[min])
		{
			min = ryt;
		}
		
		if(min!=i)
		{
			int tmp = A[i];
			A[i] = A[min];
			A[min]=tmp; 
			
			min_heapify(A, n, min);
		}
		
	}
	
	public static void build_min_heap(int[] A)
	{
		int n = A.length;
		
		for(int i=n/2-1;n>=0;n--)
		{
			min_heapify(A, n, i);
		}
		
		
		for(int i=n-1;i>=0;i--)
		{
			int tm  =  A[0];
			A[0] = A[i];
			A[i] = tm;
			
			min_heapify(A, i, 0);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		test();
//		build_heap(arr);
//		build_min_heap(arr);
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
				
	}
	
	public static void test()
	{
		for(int i=0;i<5;++i)
		{
			System.out.println(i);
		}
		System.out.println("test");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}

}
