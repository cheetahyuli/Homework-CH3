package pac6_5;

class sample6_5
{
	public static void main(String[] args)
	{
		Car car1 = new Car("1����");
		car1.start();
		
		try
		{
			car1.join();
		}
			
		catch(InterruptedException e)
		{
		}
		
		System.out.println("���Gmain()���B�z�u�@�C");
	}
}

class Car extends Thread
{
	private String name;
	
	public Car(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("���b�i��"+ name +"���B�z�u�@");
		}
	}
}