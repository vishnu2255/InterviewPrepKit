package observerPattern;

public class Main {

	public static void main(String[] args) {

		WeatherData wd= new WeatherData();
		Observer o1 = new Observer(wd);
		Observer o2 = new Observer(wd);
		wd.removebserver(o1);
		wd.setMeasurements(20, 23);
		
		
		

	}

}
