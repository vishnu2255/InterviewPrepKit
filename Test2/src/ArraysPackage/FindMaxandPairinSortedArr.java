package ArraysPackage;

public class FindMaxandPairinSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] ar= {11, 15, 6, 7, 9, 10};
		int[] ar= {4,5,6,1,2,3};
		
		System.out.println(findMax(ar));				
		
	}
	
	public static int findMax(int[] arr)
	{
		
//		if(low>high)
//		{
//			return arr[low];
//		}
//		if(low== high)
//		{
//			return arr[low];
//		}
//		
//		int mid = (low+high)/2;
//		
//		if(mid<high && arr[mid] > arr[mid+1])
//		{
//			System.out.println("found at "+mid+" value is "+ arr[mid]);
//			return arr[mid];
//		}
//		
//		if(mid>low && arr[mid-1]>arr[mid])
//		{
//			System.out.println("found at "+(mid-1)+" value is "+ arr[mid-1]);
//			return arr[mid-1];
//		}
		
//		int max=Integer.MIN_VALUE;
		
		int inde=0;
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]>arr[i+1])
		{
//			max= arr[i];
			inde = i;
			break;
		}
		
		}
		
		int sum =7;
		int cnt =0;
		int n = arr.length;
		int le = (inde+1)%arr.length;
		int ryt = inde;
		
		
		//11 15 6 7 9 10
		
		while(le != ryt)
		{
			if(arr[le]+arr[ryt] == sum )
			{
				cnt++;
				
				if(le == (n+ryt-1)%n)
				{
					return cnt;
				}
				le =(le +1)%n;
				ryt = (n + ryt -1)%n;
			}
			else if(arr[le] + arr[ryt]< sum)
			{
				le =(le +1)%n;
			}
			else
			{
				ryt = (n + ryt -1)%n;
			}
		}
		
		System.out.println("cnt is "+cnt);
		return cnt;
		
	}

}
