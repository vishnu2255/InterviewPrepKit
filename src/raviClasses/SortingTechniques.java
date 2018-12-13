package raviClasses;

public class SortingTechniques {
	
	public static void mergeSort(int[] A,int p, int r)
	{
		if(p<r)
		{
		int q =  (p+r)/2;
		mergeSort(A,p,q);
		mergeSort(A,q+1,r);
		merge(A,p,q,r);
		
		}
	}
	
	public static void merge(int[] A,int p, int q, int r) {
		
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] left = new int[n1+1];
		int[] ryt  = new int[n2+1];
		
		for(int i=0;i<n1;i++)
		{
			left[i] = A[p+i];
		}
		
		left[n1] = Integer.MAX_VALUE;
		
		for(int j=0;j<n2;j++) 
		{
			ryt[j] = A[q+1+j];
		}
		
		ryt[n2] = Integer.MAX_VALUE;
		
		int i=0,j=0;
		for(int k=p;k<=r;k++)
		{
			if(left[i]<=ryt[j])
			{
				A[k]= left[i];
				i++;
			}
			else
			{
				A[k] = ryt[j];
				j++;
			}
		}
	}
	
	public static void insertionSort(int[] A)
	{
	  for(int i=1;i<A.length;i++)
	  {
		int key = A[i];
		int j=i-1;
		
		while(j>-1 && A[j]>key)
		{
			A[j+1] = A[j];
			j--;
		}
		A[j+1] = key ; 
		
	  }
	}
	
	
	public static void bubbleSort(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
		  boolean swapped = false;		  
		  for(int j=0;j<A.length-i-1;j++)
		  {		    
			  if(A[j]>A[j+1])
			  {
				int tmp = A[j];
				A[j]    = A[j+1];
				A[j+1]  = tmp;
				swapped = true;
			  }
		  }
			  if(swapped == false)
			  {
				  break;
			  }		  	
		}
	}
	
	public static void quickSort(int[] A,int p,int q)
	{
		if(p<q)
		{
			int in = partition(A,p,q);
			quickSort(A, p , in-1);
			quickSort(A, in+1, q);					
		}		
	}
	
	public static int partition(int[] A,int p,int q)
	{
		int pivot = A[q];
		int in = -1;
		for(int i=0;i<q;i++)
		{
		  if(A[i]<=pivot)
		  {
			  in++;
			  int tmp = A[in];
			  A[in]=A[i];
			  A[i] = tmp; 			  
		  }		  
		}
		in++;
		int tmp = A[in];
		A[in] = pivot;
		A[q] = tmp; 
	      	     
		return in;
	}
	
	
	public static void selectionSort(int[] A)
	{
		for(int i=0;i<A.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[j]<A[min])  
				{
					min=j;					
				}
			}
			
			if(min!=i)
			{
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp; 
				
			}
		}
	}
	
	public static void countingSort(int[] A)
	{
		
		int[] count = new int[10];
		int[] op = new int[A.length];
				
		for(int i=0;i<A.length;i++)
		{
			++count[A[i]];				
//		  if(count[A[i]]!=0)
//		  {
//			  count[A[i]] = count[A[i]] +1; 
//		  }
//		  else
//		  {
//			  count[A[i]] = 1;
//		  }
		}
		
		for(int i=1;i<count.length;i++)
		{
			count[i] = count[i-1] + count[i];
		}
		
		
		for(int i=0;i<A.length;i++)
		{
			int tmp = A[i];
			int pos = count[tmp];
			op[pos-1] = tmp ;
			count[tmp] = count[tmp]-1;  
		}
		
		for(int i=0;i<op.length;i++)
		{
		 System.out.println(op[i]);
		}
		
	}
	
	public static void main(String[] args)
	{			
		int[] A = {2,7,1,6,1,2,0,4};
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ,");
		}
		System.out.println();
		//mergeSort(A, 0, A.length-1);
//		partition(A, 0, A.length-1);
		
		insertionSort(A);
		
//		quickSort(A, 0, A.length-1);
		
//		bubbleSort(A);
//		selectionSort(A);
		
		countingSort(A);
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ,");
		}
		System.out.println();
	}
}
