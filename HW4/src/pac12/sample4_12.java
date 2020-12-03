package pac12;

public class sample4_12
{
	public static void main(String[] args)
	{
		iVehicle[] ivc;
		ivc = new iVehicle[2];

		ivc[0] = new Car(1234, 20.5);
		
		ivc[1] = new Plane(232);
				
		for(int i = 0;i < ivc.length;i++)
		{
			ivc[i].show();
		}
		
	}
}

interface iVehicle
{
	int weight = 1000;
	void show();
}

class Car implements iVehicle
{
	private int num;
	private double gas;
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+ num + "�T�o�q��"+ gas +"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+ num);
		System.out.println("�T�o�q�O"+ gas);
	}
}

class Plane implements iVehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("�Ͳ��F"+ flight +"�Z��������");
	}
	
	public void show()
	{
		System.out.println("�������Z���O"+ flight);
	}
}