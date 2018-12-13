package raviClasses;

import java.util.Arrays;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Stack {

	int top = -1;
	int[] st;
	
	public Stack(int cap)
	{
		st = new int[cap];
	}
	
	public void push(int el)
	{
		if(!isFull())
		{
			st[++top] = el;
		}
		else
		{
			int[] st1 = new int[top*2];
//			System.arraycopy(arg0, arg1, arg2, arg3, arg4);
			System.out.println("stack is full");
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is Empty");
		}
		else
		{
			return st[top--];
		}
		return 0;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top == st.length -1;
	}
	
}
