package stackPack;

public class GetMininStack {

	static Stack st1;
	static Stack st2;
	int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMininStack sobj =new GetMininStack();
		st1 = new Stack(5);
		st2 = new Stack(5);
		
		
		sobj.push(100);
		sobj.push(20);
		sobj.push(120);		
		sobj.push(10);
		sobj.push(10);
		
		//sobj.push(30);
		
		System.out.println(sobj.pop());
		System.out.println(sobj.getMin());

		System.out.println(sobj.pop());
		System.out.println(sobj.getMin());
		
		
	}
	
	public void push(int i)
	{
		if(i<=min)
		{
			min =i;
			st2.push(min);
			st1.push(i);
		}
		else
		{
			st1.push(i);	
		}
		
	}
	
	public int pop()
	{
		if(st1.peek() == st2.peek())
		{
			st2.pop();
//			return st1.pop();
		}
			return st1.pop();
		
	}
	
	public int getMin()
	{
		return st2.peek();
	}
}
