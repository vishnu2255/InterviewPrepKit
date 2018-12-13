package TestNew;

public class Test123 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input = {'H','e','l','l','o'};
//        System.out.println(reverseArray(input));
        
        
       Stack st = new Stack();
//       st.push(5L);
//       st.push(15L);
//       st.push(25L);
//       st.push(35L);
//       st.push(45L);
//       st.push(55L);
//       st.push(65L);
//       st.push(75L);
//       st.push(85L);
//       st.push(95L);
       //st.push(105L);
       
       
       
       System.out.println(st.pop());
        
        
        
	}
	
	
	  public static char[] reverseArray(char[] array) {
		  
		  int len = array.length-1;
		  for(int i=0;i<array.length/2;i++)
		  {
			  char tmp = array[i];
			  
			  array[i] = array[len];
			  
			  array[len] = tmp;
			  
			  len--;
			  
			  
		  }
		  
		  return array;
	      //  throw new UnsupportedOperationException("Waiting to be implemented.");
	    }
	  
	  
	  
	
	    
	    
	    

}




class Stack
{
	long[] st = new long[10];
	int ele = 0;
	
    public void push(Long i) {
    	
    	if(ele < 10)
    	{
    		st[ele] = i;
    		ele++;
    	}
    	else
    	{
    		System.out.println("over flow");
    	}
    }
    
    public Long pop() {
    	
    	if(ele <= 10 && ele>0)
    	{
    		long tmp = st[ele-1];
    		
    		return tmp;
    		
    	}
//        throw new UnsupportedOperationException();
		return null;
    }
    
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(5L);
//        System.out.println(stack.pop());
//    }
}



