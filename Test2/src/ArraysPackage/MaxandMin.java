package ArraysPackage;

import java.util.Arrays;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String te = "test";
	char[] ch=	te.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
//		int[] ar= {12,3,0,62,3,1,3,2};
//		findMaxMin(ar);
	}
	
	public static void findMaxMin(int[] ar)
	{
		int max,min;
		if(ar[0]>ar[1])
		{
			max = ar[0];
			min = ar[1];
		}
		else
		{
			max = ar[1];
			min = ar[0];
		}
		
		for(int i=2;i<ar.length ;i=i+2)
		{
			int tmpmax = ar[i];
			int tmpmin = ar[i+1];
			
			if(ar[i]<ar[i+1])
			{
				tmpmax = ar[i+1];
				tmpmin = ar[i];
			}
			
			if(tmpmax>max)
			{
				max = tmpmax;
			}
			if(tmpmin<min)
			{
				min = tmpmin;
			}
		}
		
		System.out.println("max is :"+ max+" min is "+min);
		
		
	}	
	}
