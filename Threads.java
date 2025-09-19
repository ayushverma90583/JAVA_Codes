class Goodmorning extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning...");
        }
    }
}
class Welcome extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome...");
            try
			{
				Thread.sleep(50);
			}
			catch(Exception x)
			{
				System.out.print(x);
			}
        }
    }
}
class Afternoon extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Good After Noon");
        }
    }
}
class Threads
{
    public static void main(String[] args)
    {
        Goodmorning g = new Goodmorning();
        Welcome we = new Welcome();
        Afternoon a = new Afternoon();
        g.setPriority(Thread.MAX_PRIORITY);
        g.start();
        System.out.println(g.getState());
        we.start();
        a.start();
    }
}