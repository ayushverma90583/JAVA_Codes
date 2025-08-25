import java.util.Scanner;
class Function
{
	Scanner scan=new Scanner(System.in);
	public Function()
	{
		float dividend,divisor;
		float quotient;
		System.out.println("Value of Dividend :- ");
		dividend=scan.nextFloat();
		System.out.println("Value of Divisor :- ");
		divisor=scan.nextFloat();
		quotient=dividend/divisor;
		System.out.println("Answer after Dividing :- "+quotient);
	}
}
class Constructor2
{
	public static void main(String[] args)
	{
		Function f=new Function();
	}
}
