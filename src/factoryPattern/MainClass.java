package factoryPattern;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
//		EnemyShip ufo = new UFOenemy();
//		EnemyShip roc = new RocketShip();
		
//		ufo.heroShip();
//		System.out.println(ufo.getName());
		
		EnemyShipFactory fact = new EnemyShipFactory();
//		fact.makeShip("s");
		Scanner sc = new Scanner(System.in);
		
		EnemyShip en = null;
		System.out.println("What type of SHip U /R ?");
		String option="";
		if(sc.hasNextLine())
		{
			option = sc.nextLine();
			
		}
		en = fact.makeShip(option);
//		if(option.equals("U"))
//		{
//			doStuff(ufo);			
//		}
//		else if(option.equals("R"))
//		{
//			doStuff(roc);
//		}
//		
		
		if(en!=null)
		{
			doStuff(en);
		}
		else
		{
			System.out.println("Warning:: Invalid Input");
		}
//     	doStuff(en);		
		sc.close();
		
	}

	
	static void doStuff(EnemyShip obj)
	{
		obj.heroShip();
		obj.shoots();
	}
}
