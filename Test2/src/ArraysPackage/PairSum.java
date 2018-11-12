package ArraysPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("test");
		
		int[] ar= {1,5,7,-1,5 };
		
		
		
		find2(ar,6);
		
//		countPairs(ar, 6);
		
//		printPairs(ar, 6);
	}
	
	public static void find(int[] ar, int x)
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
			
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsValue(x-ar[i]))
			{
				System.out.println();
				System.out.println("found");
				break;
			}
			else
			{
				map.put(i, ar[i]);
			}
		}		
	}
	
	
	public static void find2(int[] ar, int x)
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
			
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(x-ar[i]))
			{
				System.out.println("indices are "+map.get(x-ar[i])+ " , " + i);
				System.out.println("pair is : ");
				System.out.println("found");
				break;
			}
			else
			{
				map.put(ar[i], i);
			}
		}
		
	}
	
	public static void printPairs(int[] ar,int x)
	{
	    HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
	    
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(x-ar[i]))
			{
				System.out.println("pair "+ ar[i] + " , " + (x-ar[i]));
			}
			else
			{
			    map.put(ar[i], 1);	
			}					
		}			
	}
	
	
	public static void countPairs(int[] ar,int x)
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(!map.containsKey(ar[i]))
			{
				map.put(ar[i], 0);
			}
			
			map.put(ar[i], map.get(ar[i])+1);						
		} 
		
		int twce_cnt = 0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(map.get(x-ar[i]) != null)
			{
				twce_cnt = twce_cnt + map.get(x-ar[i]);
			}
			
			if(x-ar[i] == ar[i])
			{
				twce_cnt--;
			}
		}
		
		System.out.println(twce_cnt/2);
	}

}
