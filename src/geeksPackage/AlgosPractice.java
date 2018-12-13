package geeksPackage;

public class AlgosPractice {

	public static void bubbleSort(int[] arr)
	{
	
		boolean swapped = true;
		for(int i=arr.length-1;i>0 && swapped ;i--)
		{
			swapped = false;
			for(int j=0;j<i ;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =tmp;
					swapped = true;
				}
			}			
		}			
	}
	
	public static void selectionSort(int[] arr)
	{		
		for(int i=0;i<arr.length;i++)
		{
			int min=i;			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[min])
				{
					min=j;
				}
			}
			
			int temp =arr[i];
			arr[i] = arr[min];
			arr[min]    = temp;			
		}
	}	
	
	public static void quickSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int partitionIndex = partition(arr,start,end);
			quickSort(arr,start,partitionIndex-1);
			quickSort(arr,partitionIndex+1,end);		
		}	
	}
	
	public static int partition(int[] arr,int start,int end)
	{
		int partIndex = start;
		int pivot = arr[end];
		
		
		for(int i=start;i<end;i++)
		{
		if(arr[i]<pivot)
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
	
	public static void mergeSort(int[] arr)
	{
		int len = arr.length;
		if(len<2)
		{
			return;
		}
		
		int mid=len/2;
		int[] left=new int[mid];
		int[] ryt = new int[len-mid];
		
		for(int i=0;i<mid;i++)
		{
			left[i] =arr[i];
		}
		for(int i=mid;i<len;i++)
		{
			ryt[i-mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(ryt);
		merge(left,ryt,arr);
	}		
	
	public static void merge(int[] left,int[] ryt,int[] arr)
	{
		int i=0,j=0,k=0;
		int nl = left.length;
		int nr = ryt.length;
		
		while(i<nl && j<nr)
		{
			if(left[i]>=ryt[j])
			{
				arr[k]=left[i];
				i++;k++;
			}
			else
			{
				arr[k]=ryt[j];
				j++;k++;				
			}
		}
		
		while(i<nl)
		{
			arr[k] = left[i];
			i++;k++;
		}
		
		while(j<nr)
		{
			arr[k]=ryt[j];
			j++;k++;
		}
	} 
	
	public static void printArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void retest(String str)
	{
		str += "new content";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,1,6,8,5,3,4};
//		String st= "testString";
//		
//		System.out.println(st);
//		retest(st);
//		System.out.println(st);
		
		System.out.println("before");
		printArray(arr);
//		bubbleSort(arr);
//		selectionSort(arr);
		mergeSort(arr);  
//		quickSort(arr,0,arr.length-1);
		System.out.println("after");
		printArray(arr);
	}
}
