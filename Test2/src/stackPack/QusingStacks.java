package stackPack;

public class QusingStacks {

	Stack st1 = new Stack(5);
	Stack st2 = new Stack(5);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QusingStacks ob = new QusingStacks();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		
		System.out.println(ob.dequeue());
		
		ob.enqueue(5);
		
		System.out.println(ob.dequeue());
		
	}
	
	public void enqueue(int a)
	{
		st1.push(a);
	}
	
	public int dequeue()
	{
		if(st2.isEMpty())
		{
			while(!st1.isEMpty())
			{
				st2.push(st1.pop());
			}
		}
		
		return st2.pop();
	}

}
