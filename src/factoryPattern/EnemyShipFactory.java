package factoryPattern;

public class EnemyShipFactory {

	public EnemyShip makeShip(String s)
	{
		EnemyShip en = null; 
		
		if(s.equals("U"))
		{
			en = new UFOenemy();	
			return en;
		}
		else
			if(s.equals("R"))
			{
				en = new RocketShip();
				return en;
			}
		    else
			{
				return null;
			}
		
	}
}
