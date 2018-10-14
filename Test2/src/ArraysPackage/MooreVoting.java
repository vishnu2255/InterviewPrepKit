package ArraysPackage;

public class MooreVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,5,5,1,9,0 };
		
		System.out.println(isMaj(ar));
	}
	
	public static int getMajorityEle(int[] ar)
	{
		int cnt=1;
		int majInd = 0;
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i] == ar[majInd])
			{
				cnt++;
			}
			else
			{
				cnt--;
			}
			
			if(cnt==0)
			{
				majInd = i;
				cnt=1;
			}
		}
		
		return ar[majInd];
	}
	
	public static boolean isMaj(int[] arr)
	{
		int val = getMajorityEle(arr);
		int cnt=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == val)
			{
				cnt++;
			}
		}
		
		return cnt>arr.length/2?true:false;
	}

}
