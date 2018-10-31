package heapPack;

public class BuildMinHeap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,12,3,4,302,2301};
		int heapsize = ar.length;
		
//		buildHeap(ar, heapsize);
		
		kLargestEles(ar, heapsize, 3);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	public static void kLargestEles(int[] ar,  int size, int k)
	{
		buildHeap(ar, k);
		
		for(int i=k;i<size;i++)
		{
			if(ar[i]>ar[0])
			{
				ar[0] = ar[i];
				minHeapify(ar, 0, k);
			}
		}
		
		
	}
	
	public static void buildHeap(int[] ar,int size)
	{
		for(int i=(size/2)-1;i>=0;i--)
		{
			minHeapify(ar, i, size);
		}
	}
	
	public static void minHeapify(int[] ar,int i,int size)
	{
		int smallest = i;
		int le = 2*i + 1;
		int ry = 2*i + 2;
		
		if(le<size && ar[le]<ar[smallest])
		{
			smallest = le;
		}
		
		if(ry<size && ar[ry]<ar[smallest])
		{
			smallest =ry;
		}
		
		if(smallest != i)
		{
			int tmp = ar[i];
			ar[i] = ar[smallest];
			ar[smallest] = tmp; 
			minHeapify(ar,smallest,size);
		}
		
	}

}
