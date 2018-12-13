package geeksPackage;

public class Test1 {

	public static char[] reverseArray(char[] array) {
        char[] rev = new char[array.length];
		 int j=0;
		 for(int i=array.length-1;i>=0;i--)
		 {
			 rev[j]=array[i];
			 j++;
		 }
       return rev;   
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("test");
		
		char[] input = {'H','e','l','l','o'};
      System.out.println(reverseArray(input));
	}

}
