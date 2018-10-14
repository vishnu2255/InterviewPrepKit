package ArraysPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class OddNumTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4,3,15,4,4,1,1,15,2};
		
		oddNum(ar);
	}
	
	public static int oddNum(int[] ar)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(!map.containsKey(ar[i]))
			{
				map.put(ar[i], 1);
			}
			else
			{
				map.put(ar[i], map.get(ar[i])+1);
			}
		}
		
		for(Entry<Integer, Integer> m : map.entrySet())
		{
			if(m.getValue()%2 == 0)
			{
				System.out.println(m.getKey());
				int a= m.getKey();
			}
		}
		return 0;
	}
	

}
