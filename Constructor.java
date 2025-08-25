import java.util.Scanner;
class Function
{
	public void Function()
	{
		Scanner scan = new Scanner(System.in);
		int a,num;
		System.out.println("Write the Numbers :- ");
		for(a=1; a<=5; a++)
		{
			num=scan.nextInt();
			System.out.println(num);
		}
	}
}
class Constructor
{
	public static void main(String[] args)
	{
		Function f = new Function();
	}
}

