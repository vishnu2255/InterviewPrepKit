package geeksPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.sun.javafx.collections.MappingChange.Map;

public class PeakEleinArr {

	public static int[] peak()
	{

		int[] arr= {1,2,3,4,2,8,0};
		int[] res= new int[5];
		int cnt=0;
		int n= arr.length;
		if(n>1 && arr[0]>arr[1])
		{
			res[cnt]= 0;
			cnt++;
//			return 0;
		}
		else if(n>1 && arr[n-1]>arr[n-2])
		{
			res[cnt]=n-1;
			cnt++;
//			return n-1;
		}
		else if(n==1)
		{
			res[++cnt]=0;
//			return 0;
		}
		else
		{
			for(int i=1;i<n-1;i++)
			{
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				{
					res[++cnt]=i;
//					return i;
				}
			}
			
		}
		return res;
	}
	
	public static void maxDistance()
	{
//		int[] arr= {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		int[] arr= {1, 1, 2, 2, 2, 1};
		
//		Map<Integer, Integer> map = new Map<Integer, Integer>();
		
//		HashMap<Integer, Integer> map =new HashMap<>();
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey(arr[i]))
//			{
//				int tmp =i- map.get(arr[i]);
//				if(tmp>max)
//				{
//					max=tmp;
//				}
//			}
//			
//			else
//			{
//				map.put(arr[i], i);
//			}
//		}
		
		
		
//		return max;
	}
	
	public static void findDup()
	{
		int[] arr= {2 ,3 ,1 ,2,3};
		
//		HashMap<Integer, Integer> map =new HashMap<>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey(arr[i]))
//			{
//				System.out.println(arr[i]);
//			}
//			else
//			{
//				map.put(arr[i], i);
//			}
//		}
//		
//		for(Entry<Integer, Integer> i : map.entrySet())
//		{
//			arr[i.getValue()]= i.getKey();
//		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     System.out.println(maxDistance());
//		findDup();
//		System.out.println(peak());
     
     int[] res = peak();
     for(int i=0;i<res.length;i++)
     {
    	 System.out.println(res[i]);
     }
// 	int[] arr= {1,2,3,4,2,8,0};
// 	System.out.println(arr.toString());
	}

}
