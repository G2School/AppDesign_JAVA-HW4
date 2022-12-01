package HW4;

public class P26
{
	public static void main(String[] args)
	{
		Carp26 cars[];
		cars = new Carp26[2];
		
		cars[0] = new Carp26();
		cars[1] = new RacingCarp26();
		
		for(int i = 0;i < cars.length;i ++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第" + (i - 1) + "個物件的類別是" + cl);
		}
	}
}

class Carp26
{
	protected int num;
	protected double gas;
	
	public Carp26()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCarp26 extends Carp26
{
	
	public RacingCarp26()
	{
		System.out.println("生產了賽車");
	}
}






















