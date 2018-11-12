package ArraysPackage;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,1,1,2,5,6};
				
		int[] ar1= {1,1,2,2,2,3,3,4,4,5,6};
		
		int[] ar3 = new int[10];
		
		System.arraycopy(ar, 0, ar3, 0, 5);
		System.out.println(Arrays.toString(ar3));
//		remAdjaDups(ar1);
		
		String s = "This is a interview Question";
		
		rev(s);
//		reverseStr(s);
		
//		encode(ar1);
		
		
//		System.out.println(Arrays.toString(ar));
//		
//		remDups(ar);
//		
//		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void rev(String str)
	{
		String temp="";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				res =temp + res;
				temp="";
			}
			
			temp =temp+str.charAt(i);
		}
		
		res =temp + res;
		
		System.out.println(res);
	}
	
	public static void reverseStr(String str)
	{
		int len =str.length();
		
		String[] ar = str.split(" ");
		String rev="";
		
		for(int i=0;i<ar.length;i++)
		{
			rev = ar[i]+ " "+rev;	
		}
		
		System.out.println(rev);
		
		StringBuilder strb= new StringBuilder();
		
		for(int i=ar.length-1;i>=0;i--)
		{
			strb.append(ar[i]);	
			strb.append(" "); 
		}
	
		System.out.println(strb.toString());
	}
	
	public static void encode(int[] ar)
	{
		int i=1,j=1;
		int k=0;
		//aabbccc
		while(i<ar.length)
		{
			if(ar[i]==ar[i-1])
			{
				j++;
			}
			else
			{
				ar[k] = ar[i-1];
				ar[k+1] = j;
				k=k+2;
				j=1;
			}
			i++;
			
			if(i==ar.length && j>1)
			{
				ar[k] = ar[i-1];
				ar[k+1] = j;
			}
		}
		
		for(int in=0;in<=k+1;in++)
		{
			System.out.println(ar[in]);
		}
		System.out.println(Arrays.toString(ar));
	}
	
	public static void remAdjaDups(int[ ] ar)
	{
		int s=0;
		
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]!=ar[i-1])
			{
				ar[++s] = ar[i];
			}
		}
		
		for(int i=0;i<=s;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void remDups(int[] ar)
	{
		int i=0,j=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		while(i<ar.length && j<ar.length)
		{
			if(map.containsKey(ar[i]))
			{
//				if(j==ar.length)
//				{
//					break;
//				}
				j=i+1;
				while(j<ar.length)
				{
					if(!map.containsKey(ar[j]))
					{
						map.put(ar[j], 1);
						ar[i] = ar[j];
						i++;
						break;
					}
					j++;
				}							
			}
			else
			{
				map.put(ar[i], 1);
				i++;
			}			
		}
	}

}
