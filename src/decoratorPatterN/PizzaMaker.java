package decoratorPatterN;

public class PizzaMaker {

public static void main(String[] args)
{
//Pizza bp =new Cheese(new Pineapple(new PlainPizza()));
	Pizza bp =new Pineapple(new PlainPizza());

System.out.println(bp.getDescription());
System.out.println(bp.getCost());
//bp.getDescription();


}

}
