package heapPack;

public class BuildHeap {

	static int [] arr = {10,20,30,12,3,4};
//	static int[] arr;
	static int heapsize = 5;
	
	BuildHeap()
	{		
//		heapsize= arr.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		arr= new int[heapsize+1];
//		arr[0] =10;
//		arr[1] =20;		
//		arr[2] =30;
//		arr[3] =12;
//		arr[4] =3;
//		arr[5] =4;
		
//		build_heap();
		
		
//		insertKey(123);
		
//		increase_key(4, 1000);
		
		
//		extractMax();
		
//		delEle(20);
		
//		heapSort();
	
		findKlargest(3);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
		
	public static void build_heap()
	{
		int n= arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			max_heapify(i);
		}
	}
	
	
	public static void max_heapify(int i)
	{
	
		int l = 2*i+1;
		int r = 2*i+2;
		
		int largest = i;
		
		if(l<=heapsize && arr[l]>arr[largest])
		{
			largest = l;
		}
		
		if(r<=heapsize && arr[r]>arr[largest])
		{
			largest = r;
		}
		
		if(largest!=i)
		{
			int tmp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = tmp; 
			max_heapify(largest);
		}
	}
	
	public static void increase_key(int i,int val)
	{
		if(arr[i]>val)
		{
			System.out.println("error");
		}
		else
		{
			
			arr[i] = val;
			
			while(i>0 && arr[(i-1)/2]<arr[i])
			{
				int tmp = arr[(i-1)/2];
				arr[(i-1)/2] = arr[i];
				arr[i] = tmp;
				
				i = (i-1)/2;
			}
			
		}
		
	}
	
	public static void insertKey(int a)
	{			
		int key = a;
		int hep= heapsize+1;
		int[] arrnew = new int[hep + 1];
		
		System.arraycopy(arr, 0, arrnew, 0, arr.length);
		
		arr = arrnew;
		
		arr[++heapsize] = key;
		 
		int i=heapsize;
		
		while(i>0 && arr[(i-1)/2]<arr[i])
		{
			
			int tmp = arr[(i-1)/2];
			arr[(i-1)/2] = arr[i];
			arr[i] = tmp;
			i=(i-1)/2;
		}
		
	}
	
	public static void extractMax()
	{
		build_heap();
		//max_heapify(0);
		
		int max =arr[0];
		
		int tmp = arr[heapsize];
		arr[heapsize] = arr[0];
		arr[0] = tmp;
		
		heapsize--;
		
		max_heapify(0);
		
		System.out.println("max ele is"+ max);
	}
	
	public static void heapSort()
	{
		build_heap();
		
		for(int i=arr.length-1;i>0;i--)
		{
			int tm = arr[0];
			arr[0] = arr[heapsize];
			arr[heapsize] = tm;
			
			heapsize--;
			
			max_heapify(0);
			
		}
	}
	
	public static void delEle(int ele)
	{
		build_heap();
		int ind = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ele)
			{
				ind = i;
				
				System.out.println("found at index "+i);
				break;
			}
		}
		
		int tmp = arr[ind];
		arr[ind] = arr[heapsize];
		arr[heapsize] = tmp;
		heapsize--;
		max_heapify(ind);
		
	}
	
	public static void findKlargest(int k)
	{
		build_heap();
		
		for(int i=1;i<=k;i++)
		{
			int tmp = arr[0];
			System.out.println("First Largest ELement is :"+tmp);
						
			arr[0] = arr[heapsize];
			arr[heapsize] = tmp;
			heapsize--;
			max_heapify(0);
		}
		
		
	}
	
}
