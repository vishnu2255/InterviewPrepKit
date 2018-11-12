package ArraysPackage;

import java.util.Arrays;

public class Soert012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] ar = {1,0,2,0,1};
		int[] ar = {0,1,1,2,2,0,1};
		
		System.out.println(Arrays.toString(ar));
		
//		sort0(ar);
//		
//		System.out.println(Arrays.toString(ar));
		
		sort012(ar);
		
		System.out.println(Arrays.toString(ar));
	}
	
	 static void sort0(int a[]) 
	    { 
	        int lo = 0; 
	        int hi = a.length - 1; 
	        int mid = 0,temp=0; 
	        while (mid <= hi) 
	        { 
	            switch (a[mid]) 
	            { 
	            case 0: 
	            { 
	                temp   =  a[lo]; 
	                a[lo]  = a[mid]; 
	                a[mid] = temp; 
	                lo++; 
	                mid++; 
	                break; 
	            } 
	            case 1: 
	                mid++; 
	                break; 
	            case 2: 
	            { 
	                temp = a[mid]; 
	                a[mid] = a[hi]; 
	                a[hi] = temp; 
	                hi--; 
	                break; 
	            } 
	            
	            } 
	        } 
	    } 
	
	public static void sort012(int[] ar)
	{
		int pivot  =  1;
		int lefind = 0;
		int rytind = ar.length-1;
		int mid =0;
//		for(int i=0;i<ar.length;i++)
			
			while(mid<=rytind)
		{										
			 if(ar[mid]== 0)
			{
				
				int tmp = ar[mid];
				ar[mid] = ar[lefind];
				ar[lefind] = tmp;
				lefind++;
				mid++;
			}
			 else if(ar[mid]==1)
				{
					mid++;
				}
			
				else if(ar[mid]==2)
			{
				
				int tmp = ar[mid];
				ar[mid] = ar[rytind];
				ar[rytind] = tmp;
				rytind--;
				
			}
			
		}
		
		
		
		
	}

}
