import java.util.Scanner;
class Function
{
	public void percentage()
	{
		Scanner scan=new Scanner(System.in);
		int hindi,english,math,gk,science,total,per;
		System.out.println("Write The Marks Of Subject :- ");
		System.out.print("Hindi :-");
		hindi=scan.nextInt();
		System.out.print("English :-");
		english=scan.nextInt();
		System.out.print("Math :-");
		math=scan.nextInt();
		System.out.print("Gk :-");
		gk=scan.nextInt();
		System.out.print("Science :-");
		science=scan.nextInt();
		total=hindi+english+gk+math+science;
		System.out.println("Total Marks :- "+total);
		per=total/5;
		System.out.println("Percentage :- "+per);
	}
	public void result()
	{
		int per=101;
		if(per<33)
		{
			System.out.println("Fail");
		}
		else if(per>=33 && per<50)
		{
			System.out.println("Third");
		}
		else if(per>=50 && per<75)
		{
			System.out.println("Second");
		}
		else if(per>=75 && per<=100)
		{
			System.out.println("First");
		}
		else
		{
			System.out.println("Nothing is Found");
		}
	}
}
class ClassObj3
{
	public static void main(String[] args)
	{
		Function f = new Function();
		f.percentage();
		f.result();
	}
}