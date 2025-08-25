class Function extends Thread
{
	public void run()
	{
		int a,num=2;
		for(a=1; a<=10; a++)
		{
			System.out.println(num+" * "+a+" = "+num*a);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception x)
			{
				System.out.print(x);
			}
		}
	}
}
class TestThread2
{
	public static void main(String[] args)
	{
		Function f = new Function();
		Function f1 = new Function(); 
		f.start();
		f1.start();
	}
}