import java.util.Scanner;
class week
{
	public void days(int x)
	{
		System.out.println("Sunday \n Monday \n Tuesday \n Wednesday \n Thursday \n Friday \n Saturday");
	}
}
class weekscan extends week
{
	Scanner scan = new Scanner(System.in);
	public void days()
	{
		int a;
		String d;
		System.out.println("Write the days :- ");
		for(a=1; a<=7; a++)
		{
			d=scan.next();
			System.out.println(a+". "+d);
		}
	}
}
class Overriding3
{
	public static void main(String[] args)
	{
		weekscan w = new weekscan();
		w.days(3);
	}
}