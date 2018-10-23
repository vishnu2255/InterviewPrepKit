package ArraysPackage;

import java.util.HashMap;

public class LargeSubArraywith01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {0,1,1,1,0,1,1,0};
		
		for(int i=0;i<ar.length;i++)
		{		 
		 if(ar[i]==0)
		 {
			 ar[i]=-1;
		 }		 		 
		}
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int low=0,upp=0,size=0;
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum =sum+ ar[i];
			
			if(!map.containsKey(sum))
			{
				map.put(sum, i);					
			}
			else
			{
				int tmpind = map.get(sum);
				int newsize = i-(tmpind+1);
				if(newsize>size)
				{
					size = newsize;
					low  = tmpind+1;
					upp  = i;
				}
			}					
		}
		
		System.out.println("largest array found at : "+ low +", "+ upp +" indices");
		
		
		
		
	}

}
