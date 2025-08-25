import java.util.Scanner;
class Function
{
	Scanner scan=new Scanner(System.in);
	public void even()
	{
		int a,num,sum=0;
		System.out.println("Enter the number :- ");
		num=scan.nextInt();
		for(a=0; a<=num; a++)
		{
			if(a%2==0)
			{
				System.out.print(a+" ");
				sum=sum+a;
			}
		}
		System.out.println("Sum of even numbers :- "+sum);
	}
	public void odd()
	{
		int a,num,sum=0;
		System.out.println("Enter the number :- ");
		num=scan.nextInt();
		for(a=0; a<=num; a++)
		{
			if(a%2==1)
			{
				System.out.print(a+" ");
				sum=sum+a;
			}
		}
		System.out.println("Sum of Odd numbers :- "+sum);
	}
}
class EvenOddSum
{
	public static void main(String[] args)
	{
		Function f=new Function();
		f.even();
		f.odd();
	}
}