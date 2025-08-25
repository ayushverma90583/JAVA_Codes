import java.util.Scanner;
class Function implements Runnable
{
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		char name;
		int a;
		System.out.println("Write the Names :- ");
		for(a=1; a<=3; a++)
		{
			name=scan.next().charAt(0);
			System.out.print(name+" ");
			try
			{
				Thread.sleep(300);
			}
			catch(Exception x)
			{
				
			}
		}
	}
}
class ThreadInterface2
{
	public static void main(String[] args)
	{
		Function f = new Function();
		Function f1 = new Function();
		Thread t = new Thread(f);
		Thread t1 = new Thread(f1);
		t.start();
		t1.start();
	}
}