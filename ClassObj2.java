import java.util.Scanner;
class Function
{
	Scanner scan=new Scanner(System.in);
	public void table()
	{
		int a,num;
		System.out.println("Enter the number :- ");
		num=scan.nextInt();
		for(a=1; a<=10; a++)
		{
			System.out.println(num+"*"+a+"="+num*a);
		}
	}
	public void sum()
	{
		int a,sum=0,fnum,lnum;
		System.out.println("The first number :- ");
		fnum=scan.nextInt();
		System.out.println("The last number :- ");
		lnum=scan.nextInt();
		for(a=fnum; a<=lnum; a++)
		{
			System.out.println(a);
			sum=sum+a;
		}
		
		System.out.println("Sum :- "+sum);
	}
}
class ClassObj2
{
	public static void main(String[] args)
	{
		Function f=new Function();
		f.table();
		f.sum();
	}
}