package geeksPackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayAlgos {

	public static void arrayRotate(int[] arr,int d,int n)
	{
		for(int j=0;j<d;j++)
		{
			int tmp = arr[0];
			for(int i=0;i<n-1;i++)
			{
			arr[i]=arr[i+1];	
			}				
			arr[n-1]=tmp;
		}
	}
	
	public static void posAndNegArrangement(int[] ar)
	{
		int pivot = ar[ar.length-1];
		int part = 0;
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]<0)
			{
				int tmp= ar[i];
				ar[i] = ar[part];
				ar[part] = tmp;
				part++;
			}
		}
		
		int neg = 0;
		int pos = part,n=ar.length;
		
		while(pos<n && neg<n )
		{
			int tm = ar[neg];
			ar[neg] = ar[pos];
			ar[pos] = tm;
			pos++;
			neg+=2;
		}
		
	}
	public static void swap(int[] arr,int a, int b)
	{
		int tmp = arr[a];
		arr[a]=arr[b];
		arr[b]= tmp;
	}
	
	public static void waveArray2(int[] arr)
	{
		for(int i=0;i<arr.length;i+=2)
		{
			if(i>0 && arr[i]<arr[i-1])
			{
				swap(arr,i-1,i);
			}
			
			if(i<arr.length-1 && arr[i]<arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
	}
	
	public static void waveArray(int[] arr)
	{
		int pivot = arr[arr.length-1];
		int part = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<pivot)
			{
				int tmp = arr[i];
				arr[i]  = arr[part];
				arr[part] = tmp;
				part++;
			}
		}
		
		int val = arr[part];
		arr[arr.length-1] = val;
		arr[part] = pivot;
		part++;
		
		int low=0,high=part,n=arr.length;
		
		while(low<n && high<n)
		{
			int t =arr[low];
			arr[low] = arr[high];
			arr[high] = t;
			low+=2;
			high++;
		}
		
	}
	
	public static void reverseArray(int[] ar,int start,int end)
	{
//		int start=0;
//		int end= ar.length-1;
		
		while(start<end)
		{
			int tmp=ar[start];
			ar[start] = ar[end];
			ar[end] = tmp;
			start++;
			end--;
			
		}
	}
	
	public static void findPair(int[] ar,int m)
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		boolean found = false;
		for(int i=0;i<ar.length;i++)
		{
			map.put(ar[i], i);
		}
		
		for(Entry<Integer, Integer> val : map.entrySet())
		{
			if(map.containsKey(m-val.getKey()))
			{
				//map.get(arg0)
				found = true;			
			}						
		}
		if(found)
		{
			System.out.println("pair exists");	
		}
		else
		{
			System.out.println("pair doesnot exists");	
		}
		
	}
	
	public static void printArray(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void reArrange(int[] arr)
	{
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(i,arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsValue(i))
			{
				arr[i] = i;
			}
			else
			{
				arr[i]=-1;
			}
		}
		
		
	}
	
	public static void segEvenOdd(int[] arr)
	{
		int st=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				int tmp = arr[i];
				arr[i] = arr[st];
				arr[st] = tmp;
				st++;
			}
		}				
	}
	
	public static void freqArray(int[] arr)
	{
        HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int cnt= map.get(arr[i]);
				cnt++;
				map.put(arr[i], cnt);
			}
			else
			{
			map.put(arr[i],1);
			}
		}
		
		HashMap<Integer,Integer> res = sortHashMapValues(map);
		int ind=0;
		for(Entry<Integer,Integer> m : res.entrySet())
		{
		
			int cnt = m.getValue();
			while(cnt>0)
			{
				arr[ind] = m.getKey();
				cnt--;
				ind++;
			}			
		}
		
	}
	
	public static HashMap<Integer, Integer> sortHashMapValues(HashMap map)
	{
		List list = new LinkedList(map.entrySet());
		
		Collections.sort(list,new Comparator() {

			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) (o1)).getValue())
		                  .compareTo(((Map.Entry) (o2)).getValue());
			}
			
		});
		
		HashMap res = new LinkedHashMap();
		
		Iterator it =list.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> m = (Map.Entry)it.next();
			res.put(m.getKey(), m.getValue());
		}
		return res;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
		int n=arr.length;
		int d=2;
//		posAndNegArrangement(arr);
		
		printArray(arr);
		freqArray(arr);
		
//		waveArray2(arr);
//		reArrange(arr);
//		segEvenOdd(arr);
		
//		arrayRotate(arr,3,arr.length-1);
//		reverseArray(arr,0,d-1);
//		reverseArray(arr,d,n-1);
//		reverseArray(arr,0,n-1);
//		
		printArray(arr);
		
//		findPair(arr, 12);
	}

}
