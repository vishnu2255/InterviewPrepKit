package heapPack;

public class MaxinMinHeap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaxinMin();
	}

	public static void findMaxinMin()
	{
		int[] ar = {3,4,10,12,20,30,100,1000};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=(ar.length-1)/2;i<=ar.length-1;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		
		System.out.println("Max element in min heap is : "+ max);
	}
	
	public static void delEleFromMin(int val)
	{
		int index = 0;
		int[] ar = {3,4,10,12,20,30,100,1000};
		int heapsize = ar.length-1;
		for(int i=0;i<ar.length;i++)
		{
			if(val == ar[i])
			{
				index=i;
				break;
			}
		}
		
		
		int tmp = ar[index];
		ar[index] = ar[heapsize];
		ar[heapsize] = tmp;
		
		//heapify 
		//heapify--;
		
		
	}
}
