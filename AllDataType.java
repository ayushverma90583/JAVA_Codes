import java.util.Scanner;
class AllDataType
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		float f;
		double d;
		char ch;
		int i;
		String name;
		
		System.out.print("Enter Integer value : ");
		i=scan.nextInt();
		
		System.out.print("Enter Float value : ");
		f = scan.nextFloat();
		
		System.out.print("Enter Double value : ");
		d = scan.nextDouble();
		
		System.out.print("Enter Char value : ");
		ch = scan.next().charAt(0);
		
		System.out.print("Enter String value : ");
		name = scan.next();
		
		System.out.println("\nInteger "+ i);
		System.out.println("Float "+ f);
		System.out.println("Double "+ d);
		System.out.println("Char "+ ch);
		System.out.println("String "+ name);	
	}
}
