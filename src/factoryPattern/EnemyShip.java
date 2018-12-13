package factoryPattern;

public abstract class EnemyShip {

	private String name;
	private double damage;
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name ;}
	
	public double getAmnt() {return damage;}
	public void setAmnt(double amnt) {this.damage = amnt;}
	
	public void heroShip()
	{
		System.out.println(getName()+ " follow hero ship");
	}
	
	public void display()
	{
		System.out.println(getName()+" is on the screen");
	}
	
	
	public void shoots()
	{
		System.out.println(getName()+" shoots and does damage "+ getAmnt());
	}
	
	
	
	
	
}
