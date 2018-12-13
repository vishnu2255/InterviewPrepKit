package geeksPackage;

import java.util.Scanner;

public class Test2 {

	public static int sum(int num)
	{
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+ num%10;
			num=num/10;
		}
		
		if(sum>9)
		{
			return sum(sum);
		}
		else
		{
		return sum;
		}
	}
	public static void palinSeries(int num)
	{
		char[] arr = {'a','b','c','d','e','f','g','h','i','j'};		
		System.out.println(sum(num));	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palinSeries(1234567);
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		while(t>0)
//		{
//			int n = sc.nextInt();
//			int[] arr = new int[n*2];
//			
//			for(int i=0;i<n*2;i++)
//			{
//				arr[i] = sc.nextInt();
//			}
//			
//			 
//		}
		
	}

}
