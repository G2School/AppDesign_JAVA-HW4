package HW4;

public class P25
{
	public static void main(String[] args)
	{
		Carp25 car1 = new Carp25();
		Carp25 car2 = new Carp25();
		
		Carp25 car3;
		car3 = car1;
		
		System.out.println("Car1與Car2相同 " + car1.equals(car2));
		System.out.println("Car1與Car3相同 " + car1.equals(car3));

	}
}

class Carp25
{
	protected int num;
	protected double gas;
	
	public Carp25()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}






















