package pac1;

class Car1
{
	private int num;
	private double gas;

	public Car1()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�w���ͤF�T��");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		
		System.out.println("�N�����]��"+ num +"�T�o�q�]��"+ gas);
	}

	public void show()
	{
		System.out.println("�����O"+ num);
		System.out.println("�T�o�q�O"+ num);
	}
}
