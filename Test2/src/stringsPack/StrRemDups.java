package stringsPack;

import java.util.Arrays;

public class StrRemDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String tm = "raviiva";
		String res = remDups(tm, tm.length());
		
		System.out.println(res);
		
	}
	
	public static String remDups(String str,int len)
	{
		char[] tm = str.toCharArray();
		int k=0;
		int i;
		for(i=1;i<len;i++)
		{
			if(tm[i]!=tm[i-1])
			{
				tm[k++] = tm[i-1];
//				if(i==len)
//				{
//					tm[k] = tm[i];
//				}
			}
			else
			{
				while(tm[i]==tm[i-1])
				{
					i++;
				}
			}
		}
		//tm[k++] = tm[i-1];	
		if(tm[i-1]!=tm[i-2])
		{
			tm[k++] = tm[i-1];			
		}
		
		if(k!=len)
		{
		str = String.valueOf(tm);
		return 	remDups(str, k);
		}
		
		return String.valueOf(tm);
	}

}
