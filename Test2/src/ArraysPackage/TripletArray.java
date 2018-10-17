package ArraysPackage;

public class TripletArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {};
	}
	
	public static void findTriplet(int[] ar,int x)
	{
		int chksum= 0 ;
		
		boolean found = false;
		
		for(int i=0;i<ar.length-2;i++)
		{
			int l = i+1;
			int r = ar.length-1;
			
			while(l<=r)
			{				
				chksum = ar[i] + ar[l] + ar[r];
				
				if(chksum == x)
				{
					found = true;
				}
				if(chksum < x)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
			
		}
	}

}
