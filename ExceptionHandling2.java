import java.util.Scanner;
class ExceptionHandling2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size,a;
		System.out.println("Size of array :- ");
		size = scan.nextInt();
		int arr[]=new int[size];
		try
		{
			System.out.println("Write the elements :- ");
			for(a=1; a<=size; a++)
			{
				System.out.print(a+" Element of an Array :- ");
				arr[a]=scan.nextInt();
			}
			System.out.print("All elements :- "+arr[0]+" ");	
		}
		catch(Exception x)
		{
			System.out.println(x);	
		}	
	}
}