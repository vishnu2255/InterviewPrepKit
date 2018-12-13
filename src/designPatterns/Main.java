package designPatterns;

public class Main {

	public static void main(String[] args) {
		//Singleton Instance
//		Singleton inst = Singleton.getInstance();
//		
//		System.out.println(inst.getNum());
//		Singleton inst2 = Singleton.getInstance();
//		
//		System.out.println(inst.getNum());
		
		//Student Class testing static variable
		
		Student s1 = new Student("stu1");
		Student s2 = new Student("stu2");
		
		System.out.println(s1.toString());
		
		s1.info();
		
		System.out.println(s2.toString());
		
		s2.info();
		
		
						
	}

}
