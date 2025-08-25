import java.util.Scanner;
class AreaException extends Exception
{
	public AreaException()
	{
	
	}
	public AreaException(String msg)
	{
		super(msg);
	}
}
// if we want to pass the message in Exception then we have to pass the polymorphism in Custom Exception class...
class area
{
	public void Traingle() throws AreaException
	{
		Scanner scan = new Scanner(System.in);
		float base , Height , a , area;
		System.out.println("a :- ");
		a = scan.nextFloat();
		System.out.println("Base :- ");
		base = scan.nextFloat();
		System.out.println("Height :- ");
		Height = scan.nextFloat();
		area=a*base*Height;
		System.out.println("Area of Traingle :- "+area);
		if(area>=50)
		{
			System.out.println("Area is High");
		}
		else
		{
			throw new AreaException();
		}
	}
}
class CustomException2
{
	public static void main(String[] args)
	{
		area a = new area();
		try
		{
			a.Traingle();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
	}
}