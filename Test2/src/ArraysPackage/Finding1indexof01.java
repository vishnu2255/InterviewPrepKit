package ArraysPackage;

public class Finding1indexof01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int[] ar = {0,0,0,0,0,1,1,1,1};
	int old=0 ;
	for(int i=1;i<ar.length;i=i*2)
	{
		if(ar[i]==1)
		{
			System.out.println("found between "+ old+" , "+i);
			break;
		}
		old=i;
	}
		
	}
	

}
