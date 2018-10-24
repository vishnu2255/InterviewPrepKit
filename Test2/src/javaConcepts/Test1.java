package javaConcepts;

public class Test1 {
	
	//static variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e =new Emp();
		e.salary =100;
		System.out.println(e.salary);
	}

}

class Emp { 

final int val =10 ;	
//	val = 100;
// static variable salary 
public static double salary; 
public static String name = "Harsh"; 
} 

//public class EmpDemo 
//{ 
//	public static void main(String args[]) { 
//		
//	//accessing static variable without object		 
//	Emp.salary = 1000; 
//	System.out.println(Emp.name + "'s average salary:" + Emp.salary); 
//} 
//	
//} 
