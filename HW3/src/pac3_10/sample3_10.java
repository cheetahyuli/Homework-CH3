package pac3_10;

public class sample3_10 
{
	public static void main(String[]args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("���w�����T���T�o�q{-10.0}");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
	}
}

class Car
{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g)
	{
		if(g > 0 && g < 100)
		{
			num = n;
			gas = g;
			System.out.println("�N�����]��" + num + "�A�N�T�o�q�]��" + gas);
		}
		else
		{
			System.out.println(g + "���O���T���T�o�q�ݬ�");
			System.out.println("�L�k�ܧ�T�o�q");
		}
	}
	
	public void show()
	{
		System.out.println("�����O" + this.num);
		System.out.println("�T�o�q�O" + this.gas);
	}
}

