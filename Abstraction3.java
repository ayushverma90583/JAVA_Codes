import java.util.Scanner;
abstract class Li
{
	public abstract void Students();
}
class Library extends Li
{
	public void Students()
	{
		Scanner scan = new Scanner(System.in);
		int a;
		char name;
		System.out.println("Write the names :- ");
		for(a=1; a<=5; a++)
		{
			System.out.print(a+". ");
			name = scan.next().charAt(0);
			System.out.println(a+". "+name+" ");
		}
		
	}
}
class Abstraction3
{
	public static void main(String[] args)
	{
		Library lib = new Library();
		lib.Students();
	}
}