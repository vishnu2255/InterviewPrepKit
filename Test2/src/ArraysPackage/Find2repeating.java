package ArraysPackage;

public class Find2repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {1,2,4,3,1,3};
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[Math.abs(ar[i])] >0)
			{
				ar[Math.abs(ar[i])] = -ar[Math.abs(ar[i])]; 
			}
			else
			{				
				System.out.println(Math.abs(ar[i]));
			}
		}
	}

}
