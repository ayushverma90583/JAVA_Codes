class Test implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
}
class ThreadInterface
{
	public static void main(String[] args)
	{
		Test t = new Test();
		Test t1 = new Test();
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(t1);
		th1.start();
		th2.start();
	}

}
