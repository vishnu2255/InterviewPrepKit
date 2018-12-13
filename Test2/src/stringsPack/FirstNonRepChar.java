package stringsPack;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ssmmmaarrrrtt";
		runlenEncode(str);
//		String s = "abcdefbcda";
//		firstRepChar(s);
	}
	
	public static void firstNonRepChar()
	{
		
	}
	
	public static void runlenEncode(String s)
	{
		char[] tm = s.toCharArray();
		int cnt=1;
		int k=0;
		for(int i=1;i<tm.length;i++)
		{
			if(tm[i]!=tm[i-1])
			{
				tm[k] = tm[i-1];
//				tm[++k] = (char) cnt;
				tm[++k] = Character.forDigit(cnt, 10);
				cnt=1;
				k++;
			}
			else
			{
				cnt++;
			}			
		}
		
		tm[k] = tm[tm.length-1];
		tm[++k] = Character.forDigit(cnt, 10);
		
		for(int i=0;i<=k;i++)
		{
			System.out.print(tm[i]);
		}
	}
	
	public static void firstRepChar(String s)
	{
		char[] tm = s.toCharArray();
		Character t;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<tm.length;i++)
		{
			if(map.containsKey(tm[i]))
			{
				if(map.get(tm[i])>0)
				{
					map.put(tm[i], 0-map.get(tm[i]));
				}
			}
			else
			{
				map.put(tm[i], i+1);
			}
		}
		int least=Integer.MIN_VALUE;
		for(Entry<Character, Integer> maps : map.entrySet())
		{
			if(maps.getValue()<0 && maps.getValue()>least)
			{
				least = maps.getValue();
			}
		}
		
		System.out.println(tm[Math.abs(least)-1]);
	}

}
