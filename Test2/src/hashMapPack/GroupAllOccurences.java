package hashMapPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GroupAllOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {3,1,2,4,5,6,2,5,4,3,1};
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
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
		
		for(Integer k : map.keySet())
		{
			System.out.println(k +" value is "+ map.get(k));
		}
		
		
		int i =0;
		
		
		
		for(Entry<Integer, Integer> e : map.entrySet())
		{
			int tmp = e.getValue();
			while(tmp>=1)
			{
				ar[i]=e.getKey();
				System.out.println(ar[i]);
				i++;
				tmp--;
				
			}
		}
	}

}
