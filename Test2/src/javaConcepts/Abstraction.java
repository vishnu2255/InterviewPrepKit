package javaConcepts;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle bj = new Circle("test");
		
		System.out.println(bj.getColor());
		
		bj.area();
		
	}

}


class Circle extends Shape
{

	Circle(String col) {
		super(col);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("circle area");
	}
	
}

abstract class Shape
{

	Shape(String col)
	{
		this.color = col;
	}
	
	String color;
			
	public String getColor()
	{
		return this.color;
	}
	
	abstract void area();
			
}
