import java.util.Scanner;
class Function
{
	Scanner scan=new Scanner(System.in);
	public void name()
	{
		String n;
		System.out.print("Write the name :- ");
		n=scan.next();
		System.out.println("Name :- "+n);
	}
	private void address()
	{
		String a;
		System.out.print("Write the address :- ");
		a=scan.next();
		System.out.println("Address :- "+a);
	}
	protected void age()
	{
		int age;
		System.out.print("Write the age :- ");
		age=scan.nextInt();
		System.out.println("Age :- "+age);
	}
}
class PublicPrivateProtected
{
	public static void main(String[] args)
	{
		Function f=new Function();
		f.name();
		f.age();
	}
}