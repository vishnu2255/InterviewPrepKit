package QueuePack;

public class QusingDynArr {

	int front = -1,rear=-1;
	int[] ar;
	int capacity;
	int size=0;
	
	public QusingDynArr(int cap) {
		this.capacity = cap;
		ar= new int[cap];
	}
	
	public void enqueue(int val) throws Exception
	{
		if(size == capacity)
		{
			expand();
//			throw new Exception("over flow");
		}
		
		size++;
		rear = (rear+1)%capacity;
		ar[rear] = val;
		
	}
	
	public void expand()
	{
		int len = size*2;
		int[] newarr = new int[len];
		
//		this.capacity = len;
		
		int i=front+1;
		int tmp =1;
		int k=0;
		while(tmp<=size)
		{
			newarr[k] = ar[i%this.capacity];
			i++;k++;
			tmp++;
		}
		
		this.front=-1;
		this.rear = size-1;
		this.capacity = len;
		ar=newarr;
		
	}
	
	public void shrink()
	{
		
		if(size<this.capacity/2)
		{
			int[] newarr= new int[this.capacity/2];
			
			System.arraycopy(ar, 0, newarr, 0, size+1);
			
			newarr = ar;
			this.capacity =this.capacity/2;
		}
	}
	
	
	
	public int dequeue() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("under flow");
		}
		
		size--;
		front=(front+1)%this.capacity;
		int tmp = ar[front];
		ar[front] = Integer.MIN_VALUE;
		return tmp;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub				
		
		
		
		QusingDynArr obj = new QusingDynArr(3);
		
		obj.enqueue(1);
		obj.enqueue(2);
		
		obj.enqueue(3);
						
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		
		obj.enqueue(10);
		System.out.println(obj.dequeue());
		
	}

}
