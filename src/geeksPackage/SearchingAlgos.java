package geeksPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class SearchingAlgos {

	
	public static int binarySearch(int data)
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		int low=0, high = arr.length-1;
		
		while(low<=high) 
		{
			int mid=(low+high)/2;
			
			if(arr[mid] == data)
			{
				return mid;
			}
			else if(arr[mid]<data)
			{
				low=mid+1;
			}
			else
			{
				high = mid-1;
			}
		}				
		return -1;
	}
	
	public static void firstRepeatingEle()
	{
		int[] arr= {5,2,1,2,3,8,9,0,5};
		int[] r= new int[12];
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{	
				int val = map.get(arr[i]);
				if(val>0)
				{
					val=-val;
					map.put(arr[i], val);
				}
				
//				for(Entry<Integer, Integer> ent : map.entrySet())
//				{ 
//					if(arr[i] == ent.getKey())
//					{
//						int ind =ent.getKey();
//						int val = ent.getValue();
//						if(val>0)
//						{
//							map.put(ind, -val);	
//						}						
//					}
//				}								
			}
			else
			{
				map.put(arr[i],i+1);
			}
		}
		
		int min = Integer.MIN_VALUE;
		int repVal = 0 ;
		for(Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()<0)
			{
				if(entry.getValue()>min)
				{
					min= entry.getValue();
					repVal= entry.getKey();
				}
			}
		} 
		
		System.out.println(repVal);
	}
	
	public static void sumCloseto0()
	{
		int[] arr = {60,-10,70,-80,85};
		quickSort(arr, 0, arr.length-1);
		
		int s=0,en=arr.length-1;
		int min=Integer.MIN_VALUE,mini=0,minj=0;
		
		while(s<en)
		{
			int sum  = arr[s]+ arr[en];			
			if(Math.abs(sum-0)>min)
			{
				min=Math.abs(sum-0);
				mini=s;
				minj=en;
			}											
		}
		
		System.out.println(min+" , " + mini+" , " + minj);		
	}
	
	public static void twoSum()
	{
		int[] arr = {1,2,3,4,5,6,7};
		int k=7;
		int res[] = new int[2];
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(k-arr[i]))
			{
				int ind = map.get(k-arr[i]);
				res[0] = ind;
				res[1] =i;
			}
			else
			{
				map.put(arr[i], i);
			}
			
		}
	}
	
	
	public static void reverseArray()
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		int st=0;
		int en = arr.length-1;
		
		while(st<en)
		{
			int tmp = arr[st];
			arr[st] = arr[en];
			arr[en] = tmp;
			st++;
			en--;
		}
		System.out.println(st);
		
	}
	
	public static void pairsofSum()
	{
		
		int[] arr = {1,2,3,4,5,6,7,8};
		quickSort(arr, 0, arr.length-1);
		int sum=10;
		int s=0,en=arr.length-1;
		
		while(s<en)
		{
			if(arr[s]+arr[en]>sum)
			{
				en--;
			}
			else if(arr[s]+arr[en]<sum)
			{
				s++;
			}
			else
			{
				System.out.println("starting: "+s+" ending: "+en);
				s++;
			}
		}
		
	}
	
	public static void quickSort(int[] arr,int st,int en)
	{
		if(st<en)
		{
			int pi = partition(arr,st,en); 
			quickSort(arr,st,pi-1);
			quickSort(arr,pi+1,en);
		}				
	}
	
	public static int partition(int[] arr,int st,int en)
	{
		int pa = st;  
		int pivot = arr[en];
		
		for(int i=st;i<en;i++)
		{
			if(arr[i]<pivot)
			{
				int tmp = arr[i];
				arr[i] = arr[pa];
				arr[pa] = tmp;
				pa++;
			}
		}
		
		int t = arr[pa];
		arr[pa] = arr[en];
		arr[en] =t;
		return t;
		
	}
	
	public static void firstRepEleinArr()
	{
		int[] arr= {3,2,1,2,3};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int val = map.get(arr[i]);
				if(val>0)
				{
					val=-val;
					map.put(arr[i], val);	
				}
			}
			else
			{
				map.put(arr[i], i+1);
			}
		}
		 int min =Integer.MIN_VALUE;
		for(Entry<Integer,Integer> ent : map.entrySet())
		{
			if(ent.getValue()<0 && ent.getValue()>min)
			{
				min=ent.getValue();
			}
		}
		
		System.out.println(min);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //firstRepeatingEle();
//		twoSum();
		//System.out.println(binarySearch(1));
//		reverseArray();
//		firstRepeatingEle();
		sumCloseto0();
	}

}
