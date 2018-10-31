package hashMapPack;

import java.util.HashMap;

public class DuplictesinKdist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar= {1,2,3,5,1,2,3};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int dist = 4 ;
		
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				int in = map.get(ar[i]);
				if(i-in == dist)
				{
					System.out.println(" found :"+ ar[i]);
				}
			}
			else
			{
				map.put(ar[i], i);
			}
		}
		
		
		
	}

}
