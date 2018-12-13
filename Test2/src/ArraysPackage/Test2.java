package ArraysPackage;

public class Test2 {

	private String input;
	private String sub;
		
	Test2(String input, String sub)
	{
		this.input = input;
		this.sub   = sub;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Test2 obj = new Test2("This is a string","This");
		obj.isSubstring();
		
	}
	
	public String isSubstring()
	{
		int inputlen = input.length();
		int sublen = sub.length();
		
		for(int i=0;i<=inputlen-sublen;i++)
		{
			int j;
			
			for(j=0;j<sublen;j++)
			{
				if(input.charAt(i+j) != sub.charAt(j))
				{
					break;
				}
			}
			
			if(j==sublen)
			{
				System.out.println("Yes");
				return "Yes";
			}
			
		}
		System.out.println("No");	
		return "No";
	}
	
}
