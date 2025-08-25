import java.util.Scanner;
class Function implements Runnable
{
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int a;
		System.out.print("Write the name :- ");
		for(a=1; a<=3; a++)
		{
			name=scan.next();
			System.out.print(a+" "+name);
		}
	}
}
class ThreadInterface3
{
	public static void main(String[] args)
	{
		Function f= new Function();
		f.run();
	}
}
