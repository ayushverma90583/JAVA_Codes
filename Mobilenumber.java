import java.util.Scanner;
class Mobilenumber
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		int a;
		for(a=0; a<10; a++)
		{
			arr[a]=scan.nextInt();
		}
		System.out.println("Mobile Number :- ");
		for(a=0; a<10; a++)
		{
			System.out.print(arr[a]);
		}
	}
}