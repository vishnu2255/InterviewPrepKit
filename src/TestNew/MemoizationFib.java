package TestNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemoizationFib {

	public static long fibArray[] = new long[26];
	
	public static long fibnocci(int n)
	{
	long fibVal = 0;
	if(n<2)
	{
	return n;	
	}
	else if(fibArray[(int)n]!=0)
	{
		return fibArray[(int)n];		
	}
	else 
	{
		fibVal = fibnocci(n-1) + fibnocci(n-2);
		fibArray[(int)n]  = fibVal;
		return fibVal;
	}	
	
	}
	
	static void stair(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			int sp=1;
			int str = 1;
			while(sp<=n-i)
			{
				System.out.print(" ");
				sp++;
			}
			
			while(str<=i)
			{
				System.out.print("*");
				str++;
			}			
			System.out.println();			
		}
	}
	
	static void miniMaxSum(int[] a)
	{
		int sum=0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			int tmp = sum - a[i];
			
			if(tmp<min)
			{
				min = tmp;
			}
			if(tmp>max)
			{
				max = tmp;
			}			
		}
		
		System.out.println(min + " " + max);
		
	}
	
	
	static int maxNum(int[] a)
	{
		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
		int mx = 0;	
		for(int i=0;i<a.length;i++)
		{
			if(!map.containsKey(a[i]))
				map.put(a[i], 0);
			
			map.put(a[i], map.get(a[i])+1);
			
			if(a[i]>mx)
				mx=a[i];
			
		}
		
		return map.get(mx);
	}
	
	public static void main(String[] args) {
			
//	fibArray[0]=0;
//	fibArray[1]=1;
//	
//	long pre = System.currentTimeMillis();
//	System.out.println("value is :"+  fibnocci(6));
//	
//	long pos = System.currentTimeMillis();
//	System.out.println("Time for Execcution: "+(pos-pre));

//	stair(6);	
	
	int[][] twoar = new int[][] {{1,2,3},
									{4,5,6},
									{7,8,9}};
	
					System.out.println(twoar.length);				
		
	int[] ar= {3, 2,1,3};
	maxNum(ar);
	miniMaxSum(ar);
	
	
	int pos=0,neg=0,zer=0;
	
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]<0)
		{
		neg++;	
		}
		if(ar[i]>0)
		{
		pos++;	
		}
		if(ar[i]==0)
		{
		zer++;	
		}
	}
	
	
	System.out.println(pos/ar.length);
	System.out.println(neg/ar.length);
	System.out.println(zer/ar.length);
	countSwaps(ar);

	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" , ");
	}
	
//	reverse(ar,ar.length/2-1);
	
//	reverse2(ar,0,6);
//	rotleft(ar, 2);
		
	System.out.println();

	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" , ") ;
	}
	
	}
	
	static void reverse(int[] tmp,int le)
	{
		int l =le;
		for(int i=0;i<l/2;i++)
		{
			
			int t = tmp[i];
			tmp[i]= tmp[le-1];
			tmp[le-1] = t;
			le--;
		}
	}
	
	static void reverse2(int[] a,int s,int e)
	{
		while(s<e)
		{
			int tmp = a[e-1];
			a[e-1] = a[s];
			a[s] = tmp;
			e--;
			s++;
			
		}
	}
	
	static int[] rotleft(int[] a,int d)
	{
		reverse2(a,0,d);
		reverse2(a,d,a.length);
		reverse2(a,0,a.length);			
		return null;
	}
	
	static void countSwaps(int[] a)
	{
		int cntSwap = 0;
		
		for(int i=0;i<a.length;i++)
		{
			boolean swap = false;
			for(int j=0;j<a.length-1;j++)
			{				
				if(a[j]>a[j+1])
				{
					swap=true;
					cntSwap++;
					int tmp = a[j];
					a[j]    = a[j+1];
					a[j+1]  = tmp;				
				}							
			}
			
			if(!swap)
			{
				break;
			}
		}
		
		System.out.println("Array is sorted in "+ cntSwap +" ways");
		System.out.println("First Element : "+ a[0]);
		System.out.println("Second Element :" +a[a.length-1]);
		
		
	}
	
	static void countPairs(int[] a,int sum)
	{
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!mp.containsKey(a[i]))
			{
				mp.put(a[i], 0);
			}
			
			mp.put(a[i], mp.get(a[i])+1);
			
		}
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(mp.get(sum-a[i])!=null)
			{
				cnt = cnt+ mp.get(sum-a[i]);
			}
			
			if(a[i]==sum-a[i])
			{
				cnt--;
			}
		}
		
		System.out.println(cnt+" , "+ cnt/2);
	}
	
	static String twoStrings(String s1, String s2)
	{
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(char c : s1.toCharArray())
		{
			if(!mp.containsKey(c))
			{
				mp.put(c, 0);
			}
			
			mp.put(c, mp.get(c)+1);
			
		}
		
		for(char c : s2.toCharArray())
		{
			if(mp.containsKey(c))
			{
				return "YES";
			}
		}
		
		return "NO";
	}
	
	static void lists()
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		int ind=0;
		for(Integer i : lst)
		{
			
		}
		
		Math.round(1.23);
			
	
		
	
		
	}

}
