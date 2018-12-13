package strategyPattern;

public class Main {

	public static void main(String[] args) {
		
		Duck da = new DuckA();
		Duck db = new DuckB();
		
		da.tofly();
		
		db.tofly();
		
	}

}
