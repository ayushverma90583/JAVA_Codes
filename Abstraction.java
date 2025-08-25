import java.util.Scanner;
abstract class Bull
{
	public abstract void walk();
}
class Bear extends Bull
{
	public void walk()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Bear is Walking...");
		char s;
		System.out.println("Write name :- ");
		s = scan.next().charAt(0);
		System.out.println("First Character :- "+s);
	}	
}
class Abstraction
{
	public static void main(String[] args)
	{
		Bear b=new Bear();
		b.walk();
	}
}