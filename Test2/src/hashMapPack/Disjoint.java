package hashMapPack;

import java.util.HashMap;

public class Disjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = {};
		int[] ar2 = {};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar1.length;i++)
		{
			if(!map.containsKey(ar1[i]))
			{
				map.put(ar1[i], i);
			}
		}
		
		for(int i=0;i<ar2.length;i++)
		{
			if(map.containsKey(ar2[i]))
			{
				System.out.println("Not disjoint");
				break;
			}
		}
		
		System.out.println("Disjoint sets ar1,ar2");
		
	}

}
