package ArraysPackage;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] ar= {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
//		trappingProb2(ar);
		
		trapping3(ar);
		
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
		   int j=i;
		   int left=0,ryt=0;
		   while(j>=0)
		   {
			   if(ar[j]>left)
			   {
				  left = ar[j];
			   }
			   j--;
		   }
		   int k=i;
		   while(k<ar.length)
		   {
			   if(ar[k]>ryt)
			   {
				   ryt = ar[k];
			   }
			   k++;
		   }
		   
		   int res = left<ryt?left:ryt;
		   sum = sum+ res-ar[i];
		}
		
		System.out.println(sum + " is the result");

	}
	
	public static void trappingProb2(int[] ar)
	{
		int[] left = new int[ar.length];
		int[] ryt  = new int[ar.length];
		
		int s=0,e=ar.length-1;
		int lef =0,ry =0;
		while(s<ar.length && e>=0)
		{
		  if(ar[s]>lef)
		  {
			  lef = ar[s];
		  }
		  left[s] = lef; 
		  s++;
		  
		  if(ar[e]>ry)
		  {
			  ry = ar[e];
		  }
		  ryt[e] = ry;
		  e--;
		  
		}
		
		int sum = 0 ;
		for(int i=0;i<ar.length;i++)
		{
			int tmp = left[i]<ryt[i]?left[i]:ryt[i];
			sum =sum + tmp - ar[i];
		}
		
		System.out.println(sum);
	}
	
	public static void trapping3(int[] ar)
	{
		int[] left = new int[ar.length];
		int[] ryt  = new int[ar.length];
		
		left[0] = ar[0];
		
		for(int i=1;i<ar.length;i++)
		{
			int tmp = left[i-1]>ar[i] ? left[i-1] : ar[i];
			left[i] = tmp;
		}
		
		ryt[ar.length-1] = ar[ar.length-1];
		
		for(int i=ar.length-2;i>=0;i--)
		{
			int tmp = ryt[i+1]>ar[i] ? ryt[i+1] : ar[i];
			ryt[i] = tmp;
		}
		
		int sum = 0 ;
		for(int i=0;i<ar.length;i++)
		{
			int tmp = left[i]<ryt[i]?left[i]:ryt[i];
			sum =sum + tmp - ar[i];
		}
		
		System.out.println(sum);
		
	}
}
