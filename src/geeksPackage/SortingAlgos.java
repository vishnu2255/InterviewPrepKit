package geeksPackage;

public class SortingAlgos {

	public static void bubbleSort()
	{
		int[] arr= {2,3,6,2,4};
		boolean swapped = true;
		for(int i=arr.length;i>0 && swapped;i--)
		{
			swapped = false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped =true;
				}				
			}
		}			
	}
	
	public static void selectionSort()
	{
		int[] arr= {2,3,6,2,4};
		int min,temp;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
				min = j;	
				}
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;									
		}
	}
	
	public static void insertionSort()
	{
		int[] arr= {2,3,6,2,4};
		
		for(int i=1;i<arr.length;i++)
		{
			int v = arr[i];
			int j=i;
			
			while(j>=1 && arr[j-1]>v)
			{
				arr[j] =arr[j-1];
				j--;
			}
			
			arr[j]=v;
		}				
	}
	
	public static void mergeSort(int[] arr)
	{
		int len = arr.length;
		
		if(len<2)
		{
			return;
		}
		
		int mid = len/2;
		int[] left=new int[mid];
		int[] right=new int[len-mid];
		
		for(int i=0;i<mid;i++)
		{
			left[i] = arr[i];
		}
		
		for(int i=mid;i<len;i++)
		{
			right[i-mid] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left,right,arr);
		
	}
	
	public static void merge(int[] left,int[] right,int[] arr)
	{
//		int[] res= new int[left.length+right.length];
		int i=0,j=0,k=0;
		int nl = left.length;
		int nr = right.length;
		
		while(i<nl && j<nr)
		{
			if(left[i]<=right[j])
			{
				arr[k] = left[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = right[j];
				j++;
				k++;
			}						
		}
		while(i<nl)
		{
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<nr)
		{
			arr[k] = right[j];
			k++;
			j++;
		}		
//		return res;
	}
	
	public static void printArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void QuickSort(int[] arr,int start,int end)
	{
	   	if(start<end)
	   	{
	   		int partIndex = partition(arr,start,end);
	   		QuickSort(arr,start,partIndex-1);
	   		QuickSort(arr,partIndex+1,end);	   		
	   	}
	}
	
	public static int partition(int[] arr,int start,int end)
	{
		int pivot=arr[end];
		int partIndex=start;
		
		for(int i=start;i<end;i++)
		{
			if(arr[i] <= pivot)
			{
				int tmp = arr[i];
				arr[i] = arr[partIndex];
				arr[partIndex] = tmp;
 				partIndex++;
			}
		}
		int tmp = arr[partIndex];
		arr[partIndex] = arr[end];
		arr[end] = tmp;				
		return partIndex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {2,7,1,6,8,5,3,4};
		
		System.out.println("Before Sorting");
		printArray(arr);

		QuickSort(arr,0,arr.length-1);
		
		System.out.println("After Sorting");
		printArray(arr);
	}

}
