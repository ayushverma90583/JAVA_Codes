import java.util.Scanner;
class ExceptionHandling3
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String a,b;
		System.out.println("String a :- ");
		a=scan.next();
		System.out.println("String b :- ");
		b=scan.next();
		try
		{
			System.out.println(a+" "+b);
			char petname;
			System.out.println("Write the pet name :- ");
			petname = scan.next().charAt(0);
			System.out.println("First Letter of pet name :- "+petname);
		}
		catch(Exception d)
		{
			System.out.print(d);
		}
		System.out.print("......................");
	}
}