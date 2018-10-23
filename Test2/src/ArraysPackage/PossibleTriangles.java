package ArraysPackage;

public class PossibleTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ar = {};
		
		//sort an array
		int sum = 0;
		for(int i=0;i<ar.length-2;i++)
		{
			int k=i+2;
			
			for(int j=i+1;j<ar.length-1;j++)
			{
				while(k<ar.length && (ar[i]+ar[j] > ar[k]))
				{
					k++;
				}
				
				sum = sum + k-j-1;
			}
			
		}
		System.out.println("No of Traingles formed is :"+ sum);
	}

}
