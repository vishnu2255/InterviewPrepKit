package geeksPackage;

public class BinarySearchinArray {

	
	public static int sumofrange(int[] arr,int a,int b)
	{
		
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+ arr[i];
		}				
		return sum;		
	}
	
	public static int binarysearch()
	{
		int[] arr1= {1 ,2 ,3 ,4 ,7 ,9};
		int data=7;
		
		int low=0;
		int high = arr1.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(arr1[mid]==data)
			{
				System.out.println(mid);
				return mid;
			}
			else if(data<arr1[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1 ,3 ,5 ,7, 9 ,11};
		System.out.println(sumofrange(arr,1,3));
		
	}

}
