package ArraysPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {1,2,2,3,4,5,5,6,7};
		
		
		non();
//		fmajor();
		
//		firstRepChar();
		
	//	secLar();
		//int p = findfirstoccofDup(ar, 0, ar.length-1, 5);
//		int l = findlastoccofDup(ar, 0, ar.length-1, 5);
		
		//System.out.println(l);
	}
	
	
	//find non rep ele
	
	public static void non()
	{
		int[] ar = {1,5,5,2,2,5,5,3,3,6,5,5,6,7,7};
		int res=0;
		for(int i=0;i<ar.length;i++)
		{
			res =res ^ ar[i];
		}
		
		System.out.println(res);
	}
	
	
	//find majority element
	
	public static void fmajor()
	{
		int[] ar = {1,5,5,2,3,4,5,5,3,5,6,5,5,7};
		int cnt=1;
		int tmp = -1;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==tmp)
			{
				cnt++;
			}
			else
			{
				cnt--;
			}
			
			if(cnt==0)
			{
				tmp = ar[i];
				cnt=1;
			}
		}
		
		System.out.println("ele is "+ tmp);
		
	}
	
	
	//find second largest element
	public static void secLar()
	{
		int[] ar = {1,2,3,4,5,6,3,5};
		int first = 0,sec =0;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>first)
			{
				sec = first;
				first = ar[i];				
			}
		}
		
		
		System.out.println("first is "+first + " secnd is "+sec);
	}
	
	//first repeating char in unsorted array
	
	public static void firstRepChar()
	{
		int[] ar = {1,2,3,4,5,6,3,5};
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(map.containsKey(ar[i]))
			{
				int val = map.get(ar[i]);
				
				if(val>0)
				{
					val =-val;
					map.put(ar[i], val);	
				}
								
			}
			else
			{
				map.put(ar[i], i+1);
			}
		}
		
		int mx=Integer.MIN_VALUE;
		int first = 0;
		
		
		for(Entry<Integer, Integer> m : map.entrySet())
		{
			if(m.getValue()<0 && m.getValue()>mx)
			{
				mx=m.getValue();
				first = m.getKey();
			}
		}
		
		System.out.println("value is" +mx + " + first num is "+ first);
	
		}
	
	
	//sorted array
	public static int findfirstoccofDup(int[] ar,int low,int high,int data)
	{
		if(low<=high)
		{
			int mid = (low+high)/2;
			
			if(ar[mid]==data && mid==low || ar[mid]==data && ar[mid-1]<data)
			{
				return mid;
			}
			//give preference for left array
			else if(data <= ar[mid])
			{
			return	findfirstoccofDup(ar, low, mid-1, data);
			}
			else
			{
			return findfirstoccofDup(ar, mid+1, high, data);
			}						
		}
		
		return -1;
	}
	
	public static int findlastoccofDup(int[] ar,int low,int high,int data)
	{
		if(low<=high)
		{
			int mid = (low+high)/2;
			
			if(ar[mid]==data && mid==high || ar[mid]==data && ar[mid+1]>data)
			{
				return mid;
			}
			
			//give preference
			else if(data >= ar[mid])
			{
				return	findlastoccofDup(ar, mid+1, high, data);				
			}
			else
			{
				return findlastoccofDup(ar, low, mid-1, data);
			}						
		}
		
		return -1;
	}
	
	
	
}
