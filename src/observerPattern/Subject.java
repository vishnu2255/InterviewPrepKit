package observerPattern;

import java.util.ArrayList;

public interface Subject {

	public void addObserver(ObserverIn o);
	public void removebserver(ObserverIn o);
	
	public void notifyAl();
	
	
	
}


class WeatherData implements Subject
{
private double temp;
private double humidity;

private ArrayList<ObserverIn> observers;

public WeatherData()
{
observers = new ArrayList();	
}

public void addObserver(ObserverIn o) {	
	observers.add(o);
	
}

public void removebserver(ObserverIn o) {
	int i = observers.indexOf(o);
	
	observers.remove(i);
	
}

public void setMeasurements(double t,double h)
{
	this.temp = t;
	this.humidity = h;
	notifyAl();
	
}

public void notifyAl() {

	for(ObserverIn o : observers)
	{
		o.update(this.temp,this.humidity);
	}
	
}

}