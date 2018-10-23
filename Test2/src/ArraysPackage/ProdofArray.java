package ArraysPackage;

public class ProdofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,40};
		prod2(ar);
		
		
		int left[] = new int[ar.length];
		int ryt[]  = new int[ar.length];
		
		int[]  res = new int[ar.length];
		
		int l=0,r=ar.length-1;
		
		int tmp=1,tmp2=1;
		while(l<ar.length && r>=0)
		{
			tmp = tmp * ar[l];
			left[l] = tmp;
			l++;
			
			tmp2 = tmp2* ar[r];
			ryt[r] = tmp2;
			r--;						
		}
		
		res[0] = left[0];
		res[ar.length-1] = ryt[ar.length-1];
		
		for(int i=1;i<ar.length-1;i++)
		{
			res[i] = left[i-1]*ryt[i+1];
		}
				
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	
	public static void prod2(int[] arr)
	{
	int tmp = 1;
	int[] res = new int[arr.length];
	
	for(int i=0;i<arr.length;i++)
	{
		res[i] = tmp;
		tmp   *= arr[i];
	}
	tmp=1;
	
	for(int i=arr.length-1;i>=0;i--)
	{
		res[i] *= tmp;
		tmp *= arr[i];
	}
		
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
	
	
	}

}
