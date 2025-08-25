import java.util.Scanner;
class Tables
{
	Scanner scan=new Scanner(System.in);
	public void sum()
	{
		int a,b,s;
		System.out.println("Enter the numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		s=a+b;
		System.out.println("Sum : "+s);
	}
	public void Table()
	{
		int a,num;
		num=3;
		for(a=1; a<=10; a++)
		{
			System.out.println(num+"*"+a+"="+num*a);
		}
	}	
}
class Tables2 extends Tables
{
	public void Table()
	{
		int a,num;
		num=7;
		for(a=1; a<=10; a++)
		{
			System.out.println(num+"*"+a+"="+num*a);
		}
	}
}
class Overriding2
{
	public static void main(String[] args)
	{
		Tables t2 = new Tables();
		t2.sum();
		t2.Table();
	}
}
