package designPatterns;

public class staticExample {
	
	
}

class Student{
	
	private String name;
	private int rollNum;
	static int counter=0;
	Student(String name)
	{
		this.name = name;
		this.rollNum = 1;
	}
	
	static int getRollNum()
	{
	counter++;
	return counter;
	}
	
	public void info()
	{
		System.out.println("student info Name : "+ this.name + " Rollnum : "+ this.rollNum);
	}
	
}
