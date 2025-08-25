import java.util.Scanner;
class Function
{
	public void area()
	{
		Scanner scan = new Scanner(System.in);
		int side,area;
		System.out.println("Write the side of Square :- ");
		side=scan.nextInt();
		area = side*side;
		System.out.println("Area of the Square :- "+area);
		if(area>50)
		{
			System.out.println("Area is Larger then 50");
		}
		else
		{
			System.out.println("Area is Less then 50");
		}
	}
}
class TestFinally
{
	public static void main(String[] args)
	{
		Function f = new Function();
		try
		{
			f.area();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		finally
		{
			System.out.println("Side of SQUARE are always Equal...");
		}
	}
}