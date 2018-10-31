package hashMapPack;

import java.util.HashMap;

public class ElementsinRangeAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {52,9,10,3,5,50,15,51,45,32};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] range = {48,53};
		
		for(int i=0;i<ar1.length;i++)
		{
			if(!map.containsKey(ar1[i]))
			{
				map.put(ar1[i], i);
			}
		}
		
		for(int i=range[0];i<=range[1];i++)
		{
			if(!map.containsKey(i))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
