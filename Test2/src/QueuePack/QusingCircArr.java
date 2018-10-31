package QueuePack;

public class QusingCircArr {

	
	int front =0,rear =0;
	int[] cir ;
	int capacity;
	
	QusingCircArr(int capa)
	{
		this.capacity = capa;
		cir = new int[this.capacity];
		
	}
	
	public void enqueue(int val)
	{
		rear = (rear+1)%this.capacity;
		
		if(front == rear)
		{
			System.out.println("over flow");
			
			if(rear == 0)
			{
				rear = this.capacity-1;
			}
			else
			{
				rear--;
			}
		}
		else
		{
			cir[rear] = val;
		}
		
	}
	
	
	public int dequeue()
	{
		if(front == rear)
		{
			System.out.println("under flow");
			return -1;
		}
		else
		{
			return cir[++front];
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		QusingCircArr obj =new QusingCircArr(5);
		obj.dequeue();
		
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		
		System.out.println(obj.dequeue());
		
		obj.enqueue(5);
		
		System.out.println(obj.dequeue());
		obj.enqueue(6);
		
		System.out.println(obj.dequeue());
		
	} 

}
