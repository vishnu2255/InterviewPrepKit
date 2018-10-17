package ArraysPackage;

public class EquiIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,5,15,3,4,21,2};
		findEqui(ar);
	}
	
	public static void findEqui(int[] ar)
	{
		int[] leftarr = new int[ar.length];
		int[] rytarr  = new int[ar.length];
		
		int tmp = 0;
		for(int i=0;i<ar.length;i++)
		{
			tmp = tmp + ar[i];
			leftarr[i] = tmp;
			
		}
		
		int tmp2 = 0;
		for(int i=ar.length-1;i>=0;i--)
		{
			tmp2 = tmp2 + ar[i];
			rytarr[i] = tmp2;
			
		}
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(leftarr[i] == rytarr[i+1])
			{
				System.out.println(i+ " is equi index. ");
			}
		}
		
		
	}

}
