import java.util.Scanner;
class Function
{
	Scanner scan=new Scanner(System.in);
	public void sum()
	{
		int a,b,total;
		System.out.print("Value of First Number : ");
		a=scan.nextInt();
		System.out.print("Value of Second Number : ");
		b=scan.nextInt();
		total=a+b;
		System.out.println("Total : "+total);
	}
	private void Substract()
	{
		int a,b,sub;

		System.out.print("Value of First Number : ");
		a=scan.nextInt();
		System.out.print("Value of Second Number : ");
		b=scan.nextInt();
		sub=a-b;
		System.out.println("Substract : "+sub);
	}
	protected void multiply()
	{
		int a,b,multi;
		System.out.print("Value of First Number : ");
		a=scan.nextInt();
		System.out.print("Value of Second Number : ");
		b=scan.nextInt();
		multi=a*b;
		System.out.println("Multiply : "+multi);
	}
}
class PublicPrivateProtected2
{
	public static void main(String[] args)
	{
		Function f=new Function();
		f.multiply();
		f.sum();
		//f.Substract();
	}
}