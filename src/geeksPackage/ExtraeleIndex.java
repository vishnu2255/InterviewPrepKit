package geeksPackage;

import java.util.Scanner;

public class ExtraeleIndex {

	public static int extraInd(int[]a1,int[] a2)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(i<a2.length && a1[i]!=a2[i])
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t>0)
		{
			int m=sc.nextInt();
			sc.nextLine();
			int[] arr1 = new int[m];
			int[] arr2 = new int[m-1];
//			sc.nextLine();
			String tmp = sc.nextLine();
			String input = tmp.toString();
			String[] nums = input.split(" ");
			
			for(int i=0;i<m;i++)
			{
				arr1[i] = Integer.parseInt(nums[i]);
			}
			
//			sc.nextLine();
			String input2 = sc.nextLine().toString();
			String[] nums2 = input2.split(" ");
			
			for(int i=0;i<m-1;i++)
			{
				arr2[i] = Integer.parseInt(nums2[i]);
			}
			
			
			System.out.println(extraInd(arr1,arr2));
			t--;
		}
	}

}
