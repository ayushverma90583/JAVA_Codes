import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter the number :- ");
		num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}