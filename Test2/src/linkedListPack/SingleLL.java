package linkedListPack;

public class SingleLL {

	Node head;
	int len=0;
	
	public void addNode(Node nod)
	{
//		Node tmp= new Node(data);
		
		if(head==null)
		{
			head = nod;
		}
		else
		{
			nod.next = head;
			head = nod;
		}
		len++;
	}
	
	public void printNodes()
	{
		if(head!=null)
		{
			Node tmp =head;
			
			while(tmp!=null)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
		}
		else
		{
			System.out.println("List is empty");
		}
		
		
	}
	
	public Node reverse()
	{
		Node tmp = head;
		Node prev = null;
		Node next = null;
		
		while(tmp!=null)
		{
			next = tmp.next;
			tmp.next = prev;
			
			prev = tmp;			
			tmp = next;
			
		}
		
		Node t= prev;
		
		while(t!=null)
		{
			System.out.println(t.data);
			t = t.next;
		}
		
		return prev;
	}
	
	public boolean findCycle(Node head)
	{
		if(head!=null)
		{
			Node sPtr = head;
			Node fPtr = head;
			
			while(fPtr!=null && fPtr.next!=null)
			{
				sPtr = sPtr.next;
				fPtr = fPtr.next.next;
				
				if(sPtr == fPtr)
				{
					return true;
				}
			}					
		}
		return false;		
	}
	
	public Node startofLoop() {
		
		boolean loopExists = false;
		Node sPtr ;
		Node fPtr = null;
		if(head!=null)
		{
			 sPtr = head;
			 fPtr = head;
			
			while(fPtr!=null && fPtr.next!=null)
			{
				sPtr = sPtr.next;
				fPtr = fPtr.next.next;
				
				if(sPtr == fPtr)
				{
					loopExists = true;
					break;
				}
			}						
		}
		
		if(loopExists)
		{
			sPtr = head;
			Node tm = sPtr.next;
			int len=1;
			//start of loop
			while(sPtr!=fPtr)
			{
				sPtr = sPtr.next;
				fPtr = fPtr.next;				
			}
			
			//length of the loop
			while(tm!=sPtr)
			{
				tm = tm.next;
				len++;
			}
		} 
		
		return fPtr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLL obj = new SingleLL();
		Node n1= new Node(1);
		Node n2= new Node(2);
		Node n3= new Node(3);
		Node n4= new Node(4);
		Node n5= new Node(5);
		
		obj.addNode(n1);
		obj.addNode(n2);
		obj.addNode(n3);
		obj.addNode(n4);
		obj.addNode(n5);
		
		obj.printNodes();
		
		obj.reverse();
		
	}

}

class Node 
{
	int data;
	Node next;
	
	public Node(int val)
	{
		this.data = val;
		this.next = null;
	}
	
}
