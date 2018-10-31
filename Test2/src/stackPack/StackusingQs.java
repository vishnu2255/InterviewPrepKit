package stackPack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StackusingQs {
	Queue<Integer> q1 =  new LinkedList<Integer>();
	Queue<Integer> q2 =  new LinkedList<Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
										
		StackusingQs bj = new StackusingQs();
		bj.push(1);
		bj.push(2);
		
		System.out.println(bj.pop());
		bj.push(5);
		bj.push(4);
		bj.push(6);
		System.out.println(bj.pop());
	}
	
	public void push(int i)
	{
		
		if(q1.isEmpty() && q2.isEmpty())
		{
			q1.add(i);
		}
		
		else if(q1.isEmpty())
		{			
			q1.add(i);
			
			while(!q2.isEmpty())
			{
				q1.add(q2.poll());
			}
			
		}
		
		else if(q2.isEmpty())
		{
			q2.add(i);
			
			while(!q1.isEmpty())
			{
				q2.add(q1.poll());
			}
		}
	}
	
	public int pop()
	{
		if(!q1.isEmpty())
		{
			return (int) q1.poll();
		}
		
		if(!q2.isEmpty())
		{
			return (int) q2.poll();
		}
		return 0;
	}

}
