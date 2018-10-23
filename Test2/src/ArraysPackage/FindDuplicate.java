package ArraysPackage;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {4,3,1,1,2,3,4};
		findDuplicates(ar);
		
	}
	
	static void findDuplicates(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[Math.abs(arr[i])] >= 0)
			{
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];	
			}
			else
			{
				System.out.println(Math.abs(arr[i]));
			}
		}
		
	}
	
}
