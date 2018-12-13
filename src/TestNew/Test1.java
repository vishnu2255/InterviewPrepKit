package TestNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;

public class Test1 {
	
	public static void swap(int a,int b)
	{
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		
	}
	
	public static void swap2(int a,int b)
	{
		System.out.println(a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+","+b);
		
	}
	
	
	public static boolean prime(int a)
	{
		if(a==1 || a<1)
		{
			return false;
		}
		for(int i=2;i<=a;i++)
		{
			if(i%a==0)
			{
				if(i==a)
				{
					return true;
				}
				else
				{
					return false;  
				}
			}
		}
		
		return false;
	}
	
	public static void nextGreatest(int[] ar)
	{
		
		for(int i=0;i<ar.length-1;i++)
		{
			int max = ar[i];
			
			for(int j=i+1;j<ar.length;j++)
			{				
				if(ar[j]>max)
				{
					max = ar[j];
				}
			}
			if(max!=ar[i])
			{
			ar[i] = max;	
			}
		}
		 
	}
	
	public static void nextGreatestLinear(int[] arr)
	{
		for(int i=arr.length-2;i>=0;i--)
		{
		
		if(arr[i]<arr[i+1])
		{
		arr[i]  =  arr[i+1];	
		}
		
		}
	}
	
	public static boolean palindrome(String str)
	{
//		String str= "temp";
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length/2;i++)
		{
		if(ch[i]==ch[ch.length-i-1])
		{
				
		}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void fibser(int n)
	{
		String s="tst";
		
		int a=0,b=1;
		int c=a+b;
		while(c<=n)
		{
			System.out.print(c+" , ");
			int tmp = c;
			a=b;
			b=c;
			c=a+b;
			
		}
	}
	
	public static int[] fibarr(int n)
	{
		int[] ar= new int[n+1];
		ar[0] = 0;
		ar[1] = 1;
		
		for(int i=2;i<=n;i++)
		{
			ar[i] = ar[i-1] + ar[i-2];
			
		}
		
		
		return ar;
		
	}
	
	public static int fib(int n)
	{
		
		if(n<2)
		{
			return n;
		}
//		if(n==0)
//		{
//			return 1;			
//		}
//		else if(n==1)
//		{
//			return 1;
//		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void revarr(int[] ar)
	{
		int n = ar.length;
		int l = n/2;
		int i=1;
		while(i<=l)
		{
			
		int tmp =ar[i-1]; 	
		ar[i-1] = ar[n-1];
		ar[n-1] = tmp;
		i++;n--;
		}
		
	}
	
	public static void revarr2(int[] ar)
	{	
		int s=0,e=ar.length-1;		
		while(s<e)
		{
			int tmp = ar[e];
			ar[e] = ar[s];
			ar[s] = tmp;
			s++;
			e--;
		}			
	}
	
	public static void reva(int[] ar,int s,int e)
	{
		while(s<e)
		{
			int tmp = ar[s];
			ar[s] = ar[e];
			ar[e] = tmp;
			s++;
			e--;
		}
		
	}
	
	
	public static void rotate(int[] ar,int n)
	{
	  	int l = ar.length;
	  	reva(ar,0,n-1);
	  	reva(ar,n,l-1);
	  	//revarr2(ar);
	  	reva(ar,0,l-1);
	}
	
	
	public static void remdup(int[] ar)
	{
		int j=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				ar[j]=ar[i];
				j++;
				
			}
		}
		ar[j] = ar[ar.length-1];
	}
	public static void removeduplicates(int[] a)
	{
		int k=0 ;
		int[] tmp = new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
		  if(a[i]!=a[i+1])
		  {
			  tmp[k]=a[i];
			  k++;
		  }
		}
		tmp[k]=a[a.length-1];
		
		for(int i=0;i<tmp.length;i++)
		{
			System.out.print(tmp[i] + ", ");
		}
		
		
		
	}
	
	public static void rearrange012()
	{
		int[] ar = {0,1,0,2,1,0,0,2,1,1,0,2,0,2,0};	
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + ", ");
		}
		
		System.out.println();
		
		int low=0,mid=0;
		int high = ar.length-1;
		
		while(mid<=high)
		{
			switch(ar[mid]) 
			{
			
			case 0:
				
				swaparr(mid,low,ar);	
				mid++;low++;
				break;
			case 1:
				
				mid++;
				break;
			case 2:
				
				swaparr(mid,high,ar);
				high--;
				break;			
			}
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + ", ");
		}
		
		
	}
	
	public static void swaparr(int a,int b,int[] ar)
	{
		int tmp = ar[a];
		ar[a]  = ar[b];
		ar[b]  = tmp;
	}
	
	public static void rearrangeposnegarr(int[] arr)
	{
		int p=0,s=0,n=arr.length-1;
		
		while(s<=n)
		{
			if(arr[s]<0)
			{
				swaparr(s, p, arr);
				p++;
				s++;
			}
			
//			else if(arr[s]>0)
//			{
//			   swaparr(s,n,arr);
////			   s++;
//			   n--;
//			}
			
			else
			{
				s++;
			}
		}
		
	}
	
	public static void nextGreaterElementWithStack()
	{
		int[] ar= {5,3,2,10,6,8,1,4,12,7,4};
		
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			
			if(st.isEmpty() || ar[i]<st.peek())
			{
				st.push(ar[i]);				
				
			}
			else
			{
				while(!st.isEmpty() && st.peek()<ar[i])
				{
					System.out.println(st.pop() + "=>" + ar[i]);	
				}				
			}			
		}
	
	}
	
	public static void getMinEleInStack(int[] ar)
	{
	Stack<Integer> st = new Stack<Integer>();
	
	Stack<Integer> sp = new Stack<Integer>();
	
	for(int i=0;i<ar.length;i++)
	{
	  st.push(ar[i]);
	  
	  if(sp.isEmpty())
	  {
		  sp.push(ar[i]);
	  }
	  else if(ar[i]<sp.peek())
	  {
		  sp.push(ar[i]);
	  }
	  
	}
	
	}
	
	public static void seg01()
	{
	 int[] r= {0,1,1,0,1,0,1,0};	
	 int s=0,p=0,e=r.length-1;
	 
	 while(s<=e)
	 {
	  
	 if(r[s]==0)
	  {
	  	  swaparr(s,p,r);
	  	  s++;p++;
	  }
	 else
	 {
		 s++;
	 }
	 
	 }
	 
	 for(int i=0;i<r.length;i++)
	 {
		 System.out.print(r[i]+" , ");
	 }
	 
	}
	
	public static int[] mergeTwoSortedArrays(int[] a,int[] b)
	{
		int n1=a.length,n2=b.length;
		int s1=0,s2=0,ptr=0;
		int[] fin = new int[n1+n2];
		while(s1<n1 && s2<n2)
		{		 
			if(a[s1] <= b[s2])
			{
				fin[ptr] = a[s1];
				ptr++;
				s1++;
			}
			else
			{
				fin[ptr] = a[s2];
				ptr++;
				s2++;
			}			
		}
		
		while(s1<n1)
		{
			fin[ptr] = a[s1];
			ptr++;
			s1++;
		}
		
		while(s2<n2)
		{
			fin[ptr] = a[s2];
			ptr++;
			s2++;
		}
		return fin;
	}
	
	public static void oddtimes()
	{
		int[] ar = {1,5,5,1,2,3,4,0,3,4,2};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
		if(map.containsKey(ar[i]))
		{
			int val = map.get(ar[i]);
			map.put(ar[i], ++val);
		}
		else
		{
			map.put(ar[i], 1);
		}
		
		}
		
		for(Entry<Integer, Integer> i : map.entrySet())
		{
		  System.out.println(i.getKey()+" , value "+ i.getValue());
		}
		
	}
	
	public static void findPivot()
	{
		int[] ar = {9,12,13,15,17,20,25,28,32,37,3,4,5,6,7};
		int s=0,e=ar.length;		
		
		while(s<=e)
		{
			int m= (s+e)/2;
			
			if(ar[m]>ar[m+1])
			{
				System.out.println("pivot is "+ (m+1));
				break;
			}
			else
			{
			 	if(ar[s]>ar[m])
			 	{
			 		e=m-1;
			 	}
			 	else
			 	{
			 		s=m+1;
			 	}
			}
			
		}
		
		
	}
	
	public static void arrayreaarange()	
	{
		int[] ar = {1,5,0,3,4,2};
		int[] tmp = new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
		tmp[ar[i]] = i ; 	
		}
		
	}
	
	public static void leaderInArray()
	{
		int[] ar = {1,5,0,3,4,2};
		int n=ar.length;
		int maxr=ar[n-1];
		for(int i=n-2;i>0;i--)
		{
		  if(ar[i]>maxr)  
		  {
			  System.out.println("Leader is "+ ar[i]);
			  maxr=ar[i];
		  }
		}
	}
	
	public static void binarySearch()
	{
		int[] ar = {2,5,7,8,9,10,11,12,13,14};
		int s=0,e=ar.length;
		int ele =8; 
		int m= e/2;
		
		while(s<e)
		{
			if(ar[m]==  ele  )
			{
				System.out.println("found at"+m+" index");
				break;
			}
			else if(ele<ar[m])
			{
				e=m-1;
				m=(s+e)/2;
				
			}
			else
			{
				s=s+1;
				m=(s+e)/2;
			}
			
		}
	}
	
	public static void fizzBuzz()
	{
		for(int i=1;i<=100;i++)
		{
			if((i%3==0) ||   (i%5==0))
			{
				
				if((i%3==0) && (i%5==0) )
				{
					System.out.println("FizzBuzz");
				}
				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				else
				{
					System.out.println("Fizz");
				}
				
			}
			
			else
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean anagrams(String s1, String s2)
	{
		s1 = s1.replaceAll("[^A-Za-z]+", "").toLowerCase();
		s2 = s2.replaceAll("[^A-Za-z]+", "").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
//		System.out.println(s1);
		HashMap<Character,Integer> map1= new HashMap<Character,Integer>();
		
		for(char c : s1.toCharArray())
		{
		if(map1.containsKey(c))
		{
			int tmp = map1.get(c);
			map1.put(c, ++tmp);
		}
		else
		{
			map1.put(c, 1);
		}
		}
		
HashMap<Character,Integer> map2= new HashMap<Character,Integer>();
		
		for(char c : s2.toCharArray())
		{
		if(map2.containsKey(c))
		{
			int tmp = map2.get(c);
			map2.put(c, ++tmp);
		}
		else
		{
			map2.put(c, 1);
		}
		}
		
		for(Entry<Character,Integer> e : map1.entrySet())
		{
			if(e.getValue() != map2.get(e.getKey()))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void chunkarray(int size)
	{
//		int[] tmp = new int[] {1,2,3,4,5};
		
	int[] ar = {12,3,4,1,3,90};	
//	int[] chunked = new int[ar.length];
	
	ArrayList<int[]> chunked = new ArrayList<int []>();
	
	for(int i=0;i<ar.length;i++)
	{
		int[] last = null;
		if(!chunked.isEmpty())
		{
		last = chunked.get(chunked.size()-1);
		}					 
	  
	  if(last!=null || last.length == size)
	  {
		 chunked.add(new int[] {ar[i]}); 
	  }	  
	  else
	  {
		  for(int j=1;j<size;j++)
		  {
			  last[j] = ar[i];
			  i++;
		  }
	  }
	  
	}
	
	}
	
	public static int reverseInt(int n)
	{
		int tmp = Math.abs(n);
		int rev=0;
		while(tmp!=0)
		{
			if(tmp%10==0)
			{
				tmp=tmp/10;			 	
			}
			else
			{
				rev = rev*10 + tmp%10;
				tmp=tmp/10;
			}
		}
		
		return n>0?rev:rev*-1; 
	}
	
	public static void zigzagArr()
	{
		int[] ar = {12,3,4,1,3,90};
		boolean flag=true;
		for(int i=0;i<ar.length-1;i++)
		{
			if(flag)
			{
				if(!(ar[i]<ar[i+1]))
			  	{
			  		swaparr(i, i+1 , ar);
			  		
			  	}	
				flag=!flag;
			}
			else
			{
				if((ar[i]<ar[i+1]))
				{
					swaparr(i, i+1 , ar);
				}
				
				flag=!flag;
			}		
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String t = "esting";
//		
//		for(char i:t)
//		{
//			
//		}
		
		System.out.println(anagrams("Hi! det!", "Hidet"));
		
		chunkarray(2);
		zigzagArr();
		System.out.println(reverseInt(0));
//		System.out.println(palindrome("trert"));
//		System.out.println(fib(6));
//		fizzBuzz();
//		findPivot();
//		oddtimes();
//		binarySearch();
//		leaderInArray();
//		rearrange012();
//		seg01();
		int a=112,b=100;
		int[] ar = {-1,0,3,8,-5,6,-6,7,-7,-8,0,0};
		System.out.println();		
		//nextGreatest(ar);
		//nextGreatestLinear(ar);
		//System.out.println(ar);
		//fibser(5);
		//System.out.println(fib(5));
		//int[] ar= fibarr(5);
	
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + ", ");
		}
//		rearrangeposnegarr(ar);
//		swaparr(0,1,ar);
		
//		removeduplicates(ar);
//		remdup(ar);
//		rotate(ar,3);		
//		revarr(ar);
		//revarr2(ar);
		System.out.println();
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i] + ", ");
		}		
		
//		System.out.println(a+","+b);
		
//		swap2(a,b);
		
//		System.out.println(a+","+b);
		
	}

}
