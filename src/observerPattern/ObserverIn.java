package observerPattern;

public interface ObserverIn {

	public void update(double t,double h);
}

class Observer implements ObserverIn
{	
	private double temp,humid;
	Subject s;
	public Observer(Subject s)
	{
		this.s = s;
		s.addObserver(this);
	}
	public void update(double t,double h) {
		this.temp = t;
		this.humid = h;
		display();				
	}
	
	public void display()
	{
		System.out.println("tmep is "+temp + " humidity is "+humid);
	}
	
}
