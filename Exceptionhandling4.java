import java.util.Scanner;
class Circle
{
	public void Area()
	{
		Scanner scan = new Scanner(System.in);
		{
			float pi,r;
			pi=24/7;
			System.out.println("Write the value of Radius :- ");
			r=scan.nextFloat();
			try
			{
				if(r<=10)
				{
					System.out.println("Area of the Circle is :- "+pi*r*r);
				}
				else
				{
					System.out.println("");
				}
			}
			catch(Exception x)
			{
				System.out.println(x);
			}
		}
	}
}
class Exceptionhandling4
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.Area();
	}
}