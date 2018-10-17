package ArraysPackage;

public class Separate0s1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar = {0,1,0,1,0,1,0,1,0,1,0};
		
		//separate(ar);
		
		int[] ar2 = {2,1,3,2,4,5,6};
		
		//separateEvenOdd(ar2);
		
		int[] ar3 = {-1,0,1,1,-1,0,-1,1,-1,-1};
		
		separate011(ar3);
		
	}
	
	public static void separate(int[] ar)
	{
	  int l=0,r=ar.length-1;
	  int part = -1;
	  for(int i=0;i<=r;i++)
	  {
		  if(ar[i]==0)
		  {
			  part++;
			  int tmp = ar[i];			  
			  ar[i] = ar[part];
			  ar[part] = tmp;
			  
		  }
		  
	  }
	  
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" , ");
	  }
		
	  
	}
	
	public static void separateEvenOdd(int[] ar)
	{
		int part = -1;
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]%2==0)
			{
				part++;
				int tmp = ar[part];
				ar[part] = ar[i];
				ar[i] = tmp;
			}
		}
		
		for(int i=0;i<ar.length;i++)
		  {
			  System.out.print(ar[i]+" , ");
		  }
	}
	
	public static void separate011(int[] ar)
	{
	int part = -1;
	int part2 = ar.length;
	for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" , ");
	  }
	System.out.println();
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]<0)
		{
			part++;
			int tp =ar[part];
			ar[part] = ar[i];
			ar[i] = tp;
			
		}
		
		else if(ar[i]>0)
		{
			part2--;
			int tmp = ar[part2];
			ar[part2]= ar[i];
			ar[i] = tmp;
		}
		
	}
	
	for(int i=0;i<ar.length;i++)
	  {
		  System.out.print(ar[i]+" , ");
	  }
	
	
	}

}
