package stackPack;

public class Stack {
	
	int top = -1;
	int[]arr;
	Stack(int n)
	{
		arr = new int[n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st = new Stack(4);

st.push(11);
st.push(2);
st.push(3);
st.push(4);

System.out.println(st.pop());

st.push(44);
System.out.println(st.pop());


	}
	
	public void push(int n)
	{
		if(!isFull())
		{
			arr[++top] = n;
		}
		else
		{
			System.out.println("overflow");
		}
	}
	
	public int pop()
	{
		if(!isEMpty())
		{
			return arr[top--];
		}
		return -1;
	}
	
	public int peek()
	{
		int tmp = top;
		
		if(!isEMpty())
		{
			
			return arr[tmp];
		}
		return -1;
	}
	
	public boolean isEMpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top== arr.length-1;
	}
}
