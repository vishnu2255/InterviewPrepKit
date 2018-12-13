package linkedListPack;

public class FindMidPoint {

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
//		obj.addNode(n5);
		
		obj.printNodes();
		
//		findMid(n4);
		
		findKthNodefromEnd(n4, 2);
	}

	public static void findMid(Node head)
	{
		Node slw  = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null)
		{
			fast = fast.next.next;
			slw  = slw.next;
			
		}
		
//		System.out.println(fast.data);
		System.out.println(slw.data);
		
	}
	
	public  static void findKthNodefromEnd(Node head,int k)
	{
		int n=1;
		Node tmp = head;
		while(n<k)
		{
			tmp = tmp.next;
			n++;
		}
		
		Node frs = tmp;
		Node slo = head;
		
		while(frs.next!=null)
		{
			frs = frs.next;
			slo = slo.next;
		}
		
		System.out.println(slo.data);
				
	}
	
	
}
