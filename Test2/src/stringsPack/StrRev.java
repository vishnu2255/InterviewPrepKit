package stringsPack;

import java.util.Arrays;

public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbcdeffgg";
		remDups(str);
	}
	
	public static void remDups(String s)
	{
		char[] str = s.toCharArray();
		int in=0;
		
		for(int i=1;i<str.length;i++)
		{
			if(str[i]!=str[i-1])
			{
				str[++in] = str[i];
			}
		}
		
		for(int i=0;i<=in;i++)
		{
			System.out.println(str[i]);
		}
//		System.out.println(Arrays.toString(str));
	}
	
	public static void reverseastr(String str)
	{
		char[] s = str.toCharArray();
		
		int t = s.length-1;
		for(int i=0;i<s.length/2;i++)
		{
			char tmp = s[i];
			s[i] = s[t-i];
			s[t-i] = tmp;
		}
		
		System.out.println(Arrays.toString(s));
	}
	
	public static void rev(String str)
	{
		String temp="";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				res =temp + " " + res;
				temp="";
			}
			else
			{
			temp =temp+str.charAt(i);
			}
		}
		
		res =temp +" "+ res;
		
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
	
}
