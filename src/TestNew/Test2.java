package TestNew;

public class Test2 {

	public static int countminpro(int[] arr)
	{
	 
	int negcnt=0,zerocnt=0,pro=1;
	int negMax = Integer.MIN_VALUE;
	int posmin = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			zerocnt++;
			continue;
		}
		
		if(arr[i]<0)
		{
			negcnt++;
			negMax = Math.max(negMax, arr[i]);
		}
		
		if(arr[i]>0 && arr[i]<posmin)
		{
			posmin = arr[i];
		}
		pro=pro*arr[i];
		
				
	}
		
	if(zerocnt==arr.length)
	{
		return 0;
	}
	
	
	
	return 0;
		
	}
	public static void main(String[] args) {
		
	}

}
