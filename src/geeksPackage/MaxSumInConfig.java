package geeksPackage;

public class MaxSumInConfig {

	public static int[] shuffleArray(int[] ar)
	{
		int tmp= ar[0];
		for(int i=0;i<ar.length-1;i++)
		{
			ar[i] = ar[i+1];
		}
		ar[ar.length-1]=tmp;
		return ar;
	}
	
	public static int maxSum()
	{
		int[] ar= {8, 3, 1, 2};		
		int cnt=0;		
		int max=0;
		while(cnt<ar.length)
		{
			 int sum=0;
			 ar = shuffleArray(ar);			 
			 for(int i=0;i<ar.length;i++)
			 {
				 sum=sum + i*ar[i];
			 }			 
			 if(sum>max)
			 {
				 max=sum;
			 }
			 cnt++;
		}
		
		return max;
	}
	
	public static void maxSumFunct()
	{
		int[] ar= {8, 1, 9, 4};	
		int max=0;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp = Math.abs(i-j)*Math.min(ar[i], ar[j]);
				if(temp>max)
				{
					max=temp;
				}
			}
		}
		
		System.out.println(max);
		
	}
	public static void main(String[] args)
	{
		int[] ar= {8, 3, 1, 2};	
		int n=ar.length;
		//System.out.println(maxSum());
		//System.out.println(maxSum2(ar,n));
		
		maxSumFunct();
	}
	
	public static int maxSum2(int[]ar,int n)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			int sum =0 ;
			for(int j=0;j<n;j++)
			{
				int index = (i+j)%n;
				sum=sum+ j*ar[index];
			}
			
			res= Math.max(res, sum);
		}
		
		return res;
	}	
}

