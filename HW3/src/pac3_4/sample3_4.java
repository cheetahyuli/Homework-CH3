package pac3_4;

public class sample3_4
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
	}
}

class Car
{
	int num;
	double gas;

	void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + this.gas);
	}
}