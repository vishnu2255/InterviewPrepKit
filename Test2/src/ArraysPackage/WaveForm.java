package ArraysPackage;

public class WaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//sort the array then swap values
		int[] ar= {};
						
		for(int i=0;i<ar.length;i=i+2)
		{
			if(i>0 && ar[i-1]>ar[i])
			{
				int tmp = ar[i-1];
				ar[i-1] = ar[i];
				ar[i]   = tmp;
			}
			
			if(i<ar.length && ar[i+1]>ar[i])
			{
				int tmp = ar[i+1];
				ar[i+1] = ar[i];
				ar[i]   = tmp;
			}
		}
	}

}
