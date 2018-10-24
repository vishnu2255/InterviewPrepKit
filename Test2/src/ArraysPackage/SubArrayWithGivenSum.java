package ArraysPackage;

import java.util.HashMap;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {5,4,6,7,9,8,3,1,2};
//		app1(ar,21);
		
		int[] ar1 = {5,4,1,-5,7};
		app2(ar1,10);
		
	}
	
	public static void app1(int [] ar,int sum)
	{
		int s=0,e=0;
		int tmpsum = ar[0];
		
		while(e<ar.length && tmpsum!=sum)
		{
			if(tmpsum<sum)
			{
				e++;
				tmpsum =tmpsum + ar[e];
			}
			else
			{
				s++;
				tmpsum =tmpsum - ar[s-1];
			}
//		for(int i=s;i<=e;i++)
//		{
//			tmpsum = tmpsum + ar[i];
//		}
		
		}
		
		System.out.println(tmpsum+" is result sum");
									
	}
	
	public static void app2(int [] ar,int sum)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
				
		int tmp=0;
		int dif=0;
		
		map.put(0, -1); 
		
		for(int i=0;i<ar.length;i++)
		{				
			tmp = tmp + ar[i];					
			dif = tmp - sum;
			
			map.put(tmp, i);
			
			if(map.containsKey(dif))
			{
				System.out.println(map.get(dif)+1 +" , "+ i);
				break;
			}
			
		}
		
	}

}
