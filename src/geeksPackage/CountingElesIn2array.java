package geeksPackage;

import java.util.Scanner;

public class CountingElesIn2array {

	public static void print(int[] arr1,int[] ar2)
	{
	
		for(int i=0;i<arr1.length;i++)
		{
			int cnt=0;
			for(int j=0;j<ar2.length;j++)
			{
				if(ar2[j]<=arr1[i])
				{
				cnt++;	
				}
			}
			System.out.println("element "+arr1[i]+" count "+cnt);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t>0)
		{
//			int m = sc.nextInt();
//			int n = sc.nextInt();
			int[] arr1= {1 ,2 ,3 ,4 ,7 ,9};
			
			int[] arr2= {0 ,1 ,2 ,1 ,1 ,4};
			
//			int[] arr1= new int[m];
//			int[] arr2= new int[n];
//			
//			for(int i=0;i<m;i++)
//			{
//			arr1[i]=sc.nextInt();	
//			}
//			
//			for(int i=0;i<n;i++)
//			{
//				arr2[i]=sc.nextInt();
//			}
			
		print(arr1,arr2);	
			t--;
		}
		
	}

}
