package geeksPackage;

import java.util.Scanner;
import java.util.Stack;

public class IronMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String input = sc.nextLine();
			input=input.toLowerCase();
			
			
//			Stack<Character> st = new Satck<Character>();
			StringBuilder res= new StringBuilder();
//			String res="";
			for(int i=0;i<input.length();i++)
			{
//				if((int)input.charAt(i) != 32)
//				{
					if(((int)input.charAt(i)>=97 && (int)input.charAt(i)<=122) || ((int)input.charAt(i)>=48 && (int)input.charAt(i)<=57))
					{
//						res.insert(i, input.charAt(i));
//						res.append(input.charAt(i));	
//						res = res+input.charAt(i);
						res.append((char)(input.charAt(i)));
					}
//				}
				
				
			}
			
//			StringBuilder str = new StringBuilder(res);
//			StringBuilder str1= str.reverse();
			String str= res.toString();
			String str2= res.reverse().toString();
			
			if(str.equals(str2))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			t--;
		}
		
	}

}
