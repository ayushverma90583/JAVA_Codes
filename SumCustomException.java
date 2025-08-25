import java.util.Scanner;
class Function extends Exception
{
	public void function()
	{
	
	}
}
class Sum 
{
	Scanner scan=new Scanner(System.in);
	public void sum() throws Function
	{
		int a,b,sum;
		System.out.println("Write First Value :- ");
		a=scan.nextInt();
		System.out.println("Write Second Value :- ");
		b=scan.nextInt();
		sum=a+b;
		System.out.println("Sum :- "+sum);
	}
}
class SumCustomException
{
	public static void main(String[] args)
	{
		Sum s = new Sum();
		try
		{
			s.sum();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
	}
}

