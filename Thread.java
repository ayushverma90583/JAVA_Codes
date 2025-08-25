class Test extends Thread
{
	public void fun()
	{
		int i;
		System.out.println("Loading...");
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
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
class Thread
{
	public static void main(String[] args)
	{
		Test t = new Test();
		Test t1 = new Test();
		t.fun();
		t1.fun();
	}

}
