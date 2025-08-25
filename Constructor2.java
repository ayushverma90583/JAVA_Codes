import java.util.Scanner;
class Months
{
	Scanner scan = new Scanner(System.in);
	public Months()
	{
		int a;
		char m;
		System.out.println("Write all the Months name :- ");
		for(a=1; a<=12; a++)
		{
			m=scan.next().charAt(0);
			System.out.println(a+"."+ m);
		}
	}
}
class Constructor2
{
	public static void main(String[] args)
	{
		Months m = new Months();
	}

}
