package linkedListPack;

class CirNode
{
int data;
CirNode next;

	CirNode(int data)
	{
		this.data = data;
		this.next = null;
	}	
}

public class CircularLL {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL lst = new CircularLL();
		addHead(13);
		addHead(14);
		addHead(15);
		
//		remHead();
		
		remTail();
		
		addTail(1);
		addTail(2);
		
		addTail(3);
		
		remTail();
		
		addTail(3);
		addTail(4);
		addTail(5);
		
		printCLL();
		
		remHead();
		
		printCLL();
		
		remTail();
		
		printCLL();
		
		//can implement stack and queues using CLL
		
		
	}
 	
	static CirNode tail;
	static int len=0;
	
	public static void addHead(int data)
	{
		CirNode temp = new CirNode(data);
		
		if(tail == null)
		{
			tail = temp;
			tail.next = tail;
		}
		else
		{
			temp.next = tail.next;
			tail.next = temp;
		}
		len++;
	}
	
	public static void addTail(int data)
	{
		addHead(data);
		tail = tail.next;
		len++;
	}
	
	public static void remHead()
	{
		if(tail == null)
		{
			return;
		}
		
		else if(tail.data == tail.next.data)
		{
			tail = null;
			System.out.println("deleted tail "+ tail.data);
			len--;
			return;
			
		}
		
		else
		{
			CirNode tmp = tail.next;
//			tail = tail.next;
			tail.next = tail.next.next;
			System.out.println("deleted from the head "+ tmp.data);
			len--;
			tmp = null;
		}
		
	}
	
	public static void remTail()
	{
		if(tail == null)
		{
			return;
		}
		else if(tail.data == tail.next.data)
		{
			tail = null;
			System.out.println("deleted tail "+ tail.data);
			len--;
			return;
		}
		else
		{
			CirNode tmp = tail;
			
			while(tmp.next!=tail)
			{
				tmp = tmp.next;
				
			}
			
			CirNode tm = tail;
			
			tmp.next = tm.next;
			tail = tmp ;
			
			len--;
			
			System.out.println("deleted from tail Is "+ tm.data);
		}
			
	}
	
	public static void printCLL()
	{
		CirNode tmp = tail;
		if(tmp!=null)
		{
		
			System.out.println(tmp.data);
			tmp = tail.next;
		while(tmp!=tail)
		{
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		}
		
	}
	

}
