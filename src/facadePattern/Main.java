package facadePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Facade f =new Facade(100,12);
		f.withdraw(1100);
		
		f.deposit(1200);
	}

}
