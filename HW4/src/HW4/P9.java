package HW4;

public class P9
{
	public static void main(String[] args)
	{
		RacingCarp9 rccar1;
		rccar1 = new RacingCarp9();
		
		rccar1.newshow();
	}
}

class Carp9
{
	protected int num;
	protected double gas;
	
	public Carp9()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為 " + num + " 汽油量設為 " + gas);
	}
	
	public void show()
	{
		System.out.println("車號為 " + num);
		System.out.println("汽油量為 " + gas);
	}
}

class RacingCarp9 extends Carp9
{
	private int course;
	
	public RacingCarp9()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為 " + course);
	}
	
	public void newshow()
	{
		System.out.println("賽車車號為 " + num);
		System.out.println("汽油量為 " + gas);
		System.out.println("賽車編號為 " + course);
	}
}






















