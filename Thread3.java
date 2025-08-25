import java .util.Scanner;
class even extends Thread
{
	Scanner scan = new Scanner(System.in);
	public void run()
	{
		int a;
		for(a=1; a<40; a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			try
			{
				Thread.sleep(400);
			}
			catch(Exception x)
			{
				System.out.println(x);
			}
		}
	}
}
class Thread3
{
	public static void main(String[] args)
	{
		even e = new even();
		even e1 = new even();
		e.start();
		e1.start();
	}
}