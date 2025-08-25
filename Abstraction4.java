import java.util.Scanner;
abstract class Math
{
	public abstract void table();
}
class Maths extends Math
{
	public void table()
	{
		Scanner scan = new Scanner(System.in);
		int a,num;
		System.out.println("Write the Number :- ");
		num=scan.nextInt();
		for(a=1; a<=10; a++)
		{
			System.out.println(num+"*"+a+"="+num*a);
		}
	}
}
class Abstraction4
{
	public static void main(String[] args)
	{
		Maths m = new Maths();
		m.table();
	}
}