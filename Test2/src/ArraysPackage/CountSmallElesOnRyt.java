package ArraysPackage;

public class CountSmallElesOnRyt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {10,3,4,5,7,1,2};
		findsmallElesCnt(ar);
	}
	
	public static void findsmallElesCnt(int[] ar)
	{
		
		for(int i=0;i<ar.length-1;i++) 
		{
			int cnt=0;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
				{
					cnt++;
				}
			}
			System.out.println("count for "+ ar[i] + " ," +cnt);
		}
		
	}

}
