package raviClasses;

public class Queue {

  private int capacity;
  private int front;
  private int rear;
  private int[] q;
	
	Queue(int cap)
	{
		this.capacity = cap;
		q= new int[this.capacity];
		front = -1;
		rear  = -1;		
	}
	
	
	public int enqueue(int val)
	{
//		if(isFull())
//		{
//			System.out.println("Q is Full::");
//			return;
//		}
		 
		if((rear+1)%this.capacity == front)
		{
			//System.out.println("Q is Full::");
			return 0;
		}
		else if(isEmpty())
		{
			front=rear=0;			
		}
		else
		{
			rear=(rear+1)%this.capacity;			
		}
		return q[rear] = val;		
	}
	
	
	public int dequeue()
	{
		int tem=-1;
		if(isEmpty())
		{
			System.out.println("Q is Empty");
			return -1;
		}
		else if(front == rear)
		{
			tem = q[front];
			System.out.println(tem+" is removed");
			front=rear=-1;		
		}
		else 
		{
			tem = q[front];
			System.out.println(tem+" is removed");
			front=(front+1)/this.capacity;
		}
		return tem;
	}
	
	public boolean isFull()
	{
		return rear == this.capacity-1;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
		return true;	
		}
		else
		{
		return false;
		}		
	}
	
}
