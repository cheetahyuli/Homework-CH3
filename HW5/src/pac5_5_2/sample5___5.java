package pac5_5_2;

public class sample5___5 
{
	public static void main(String[] args)throws CarException
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234, -10.0);
				
		car1.show();
	}
}


class CarException extends Exception
{
}

class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�w���ͤF�T��");
	}

	public void setCar(int n, double g) throws CarException
	{
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		
		else
		{
			num = n;
			gas = g;
			
			System.out.println("�N�����]��"+ num +"�T�o�q�]��"+ gas);
		}
	}

	public void show()
	{
		System.out.println("�����O"+ num);
		System.out.println("�T�o�q�O"+ num);
	}
}