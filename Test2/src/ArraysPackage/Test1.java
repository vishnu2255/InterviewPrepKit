package ArraysPackage;

import java.util.HashMap;

public class Test1 {

	//private members of the class
	private int[] input;
	private int sum;
	
	//constructor to initialize variables
	Test1(int[] input, int sum)
	{
		this.input = input;
		this.sum   = sum;
	}
	
	
	public static void main(String[] inputgs) {
		// TODO Auto-generated method stub
//		int[] input = {1,8,2,3,5,7};
		int[] input = {-10,-4,0,5,-6};
		Test1 o = new Test1(input,-10);
		
		o.printPairs();
	}

	//method which returns pairs
	public String printPairs()
	{
		String res="";
		String pair="";
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++)
		{
			
			if(map.containsKey(sum-input[i]))
			{
				pair = "("+ (sum-input[i])+ "," + input[i] +")";
				res = res + " , " +pair;
				pair="";
			}
			else
			{
				map.put(input[i], i);
			}
		}
		
		System.out.println(res.substring(2));
		return res;
	}
	
}
