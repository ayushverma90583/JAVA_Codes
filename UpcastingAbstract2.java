import java.util.Scanner;
abstract class p
{
	public abstract void Percentage();
}
class p2 extends p
{
	public void Percentage()
	{
		Scanner scan = new Scanner(System.in);
		int h,e,m,per,sum;
		System.out.print("Marks of Hindi :- ");
		h=scan.nextInt();
		System.out.print("Marks of English :- ");
		e=scan.nextInt();
		System.out.print("Marks of Maths :- ");
		m=scan.nextInt();
		sum=h+e+m;
		System.out.print("Sum :- "+sum);
		per=sum/3;
		System.out.println("Percentage :- "+per);
	}
}
class p3 extends p2
{
	public void Percentage()
	{
		Scanner scan = new Scanner(System.in);
		int h,e,m,g,per,sum;
		System.out.print("Marks of Hindi :- ");
		h=scan.nextInt();
		System.out.print("Marks of English :- ");
		e=scan.nextInt();
		System.out.print("Marks of Maths :- ");
		m=scan.nextInt();
		System.out.print("Marks of G.K :- ");
		g=scan.nextInt();
		sum=h+e+m+g;
		System.out.print("Sum :- "+sum);
		per=sum/4;
		System.out.println("Percentage :- "+per);
	}
	
}
class UpcastingAbstract2
{
	public static void main(String[] args)
	{
		p2 per = new p3();
		per.Percentage();
	}
}