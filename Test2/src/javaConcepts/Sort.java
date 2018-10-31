package javaConcepts;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {7,9,5,0,8,2,90,16};
		
		insertionSort(ar);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	public static void insertionSort(int[] ar)
	{
		
		for(int i=1;i<ar.length;i++)
		{
			int key = ar[i];
			
			int j = i-1;
			
			while(j>=0 && ar[j]>key)
			{
				ar[j+1] = ar[j];
				j--;
			}
			
			ar[++j] = key;
			
		}
		
	}

}
