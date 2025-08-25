class Function
{
	public void Numbers()
	{
		int num=-4;
		if(num>=0)
		{
			System.out.println("Positive");
		}
		else 
		{
			System.out.println("Negetive");
		}
	}
	
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
class Function2 extends Function
{
	public void sleep()
	{
		int a;
		for(a=0; a<5; a++)
		{
			System.out.println("Sleeping");
		}
	}
}
class Overriding
{
	public static void main(String[] args)
	{
		Function2 f2=new Function2();
		f2.sleep();
		f2.Numbers();
	}
}