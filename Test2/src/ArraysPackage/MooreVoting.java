package ArraysPackage;

public class MooreVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,5,5,1,9,0 };
		int[] ar2= new int[3];
		
		int[] ar3 = new int[12];
		
		System.arraycopy(ar, 0, ar3, 0 ,ar.length);
		
		for(int i=0;i<ar3.length;i++)
		{
			System.out.println(ar3[i]);
		}
		
//		System.out.println(isMaj(ar));
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
