package hashMapPack;

import java.util.HashMap;

public class Subarrawid0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = {11,10,-5,-3,-2,10,5,-1,-6};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();		
		
		int tmpsum = 0;
		
		map.put(0, -1);
		
		for(int i=0;i<ar1.length;i++)
		{
			tmpsum = tmpsum+ ar1[i];
			
			if(!map.containsKey(tmpsum))
			{
				map.put(tmpsum, i);			
			}
			
			else
			{
				System.out.println("0 sum sub array with indices "+(map.get(tmpsum)+1)+" , "+i);
			}			
		}
		
	}

}
