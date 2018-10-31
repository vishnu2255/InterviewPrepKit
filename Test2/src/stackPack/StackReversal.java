package stackPack;

public class StackReversal {

	static Stack st1 = new Stack(7);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackReversal obj = new StackReversal();
		obj.greaterEle();
//		st1.push(1);
//		st1.push(2);
//		st1.push(3);
//		st1.push(4);
//		
//		obj.reverse();
//		
//		System.out.println(st1.pop());
		
	}	
	
	public void getMinReversals()
	{
		
		int [] ar = {};
		
		//if count of values is odd!! can't balance
		if((ar.length)%2 !=0)
		{
			System.out.println("no balance");
		}
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]=='}' && !st1.isEMpty())
			{
				int x = st1.peek();
				if(x == '{')
				{
					st1.pop();
				}
				else
				{
					st1.push(ar[i]);
				}
			}
			else
			{
				st1.push(ar[i]);
			}
		}
		
		int n=0;
		int len = st1.top;
		while(!st1.isEMpty() && st1.peek()=='{')
		{
			st1.pop();
			n++;
		}
		
		System.out.println(len/2 + n%2);
		
	}
	
	public void redundantParanthesis()
	{
		int[] ar= {};
		
		for(int i=0;i<ar.length;i++)
		{
		
			if(ar[i]==')')
			{
				int top = st1.peek();
				st1.pop();
				
				if(top == '(')
				{
					System.out.println("redundant");
				}
				else
				{
					while(top!='(')
					{
						top = st1.pop();
						
					}
				}
				
			}
			else
			{
				st1.push(ar[i]);
			}
			
		}
	}
	
	public void evaluateSpan()
	{
		int [] ar = {10,20,1,5,25,500,60};
		int [] stock = new int[7];
		
		stock[0] = 0;
		
		for(int i=1;i<ar.length;i++)
		{
			int inde = st1.peek();
			while(!st1.isEMpty() && ar[inde]<ar[i])
			{
				st1.pop();
			}
			
			stock[i] = st1.isEMpty() ? i : (i-inde-1);
			st1.push(i); 
			
		}
		
	}
	
	public void greaterEle()
	{
		int [] ar = {10,20,1,5,25,500,60};
		int [] res = new int[7];
		
		st1.push(0);
		int ele;		
		for(int i=1;i<ar.length;i++)
		{
		
//			int tmpind = st1.peek();
			
			if(!st1.isEMpty())
			{
				ele = st1.pop();
				
				while(ar[ele]<ar[i])
				{
					res[ele] = ar[i];
					
					if(st1.isEMpty())
					{
						break;
					}
					ele = st1.pop();
				}
				
				if(ar[ele]>ar[i])
				{
					st1.push(ele);
				}
			}
			st1.push(i);
//			while(!st1.isEMpty() && ar[i]>=ar[tmpind])
//			{
//				
//				res[tmpind] = ar[i];
//				tmpind = st1.pop();
//			}			
								
		}
		
		while(!st1.isEMpty())
		{
			ele = st1.pop();
			res[ele] = -1;
		}
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
		
	}
	
	public void reverse()
	{
		
		if(!st1.isEMpty())
		{
			int item = st1.pop();
			reverse();
			insertAtBottom(item);
		}
	}
	
	public void insertAtBottom(int item)
	{
		if(st1.isEMpty())
		{
			st1.push(item);
		}
		else
		{
			int topitem = st1.pop();
			insertAtBottom(item);
			st1.push(topitem);
			
		}
	}

}
