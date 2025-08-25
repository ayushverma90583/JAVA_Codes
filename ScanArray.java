import java.util.Scanner;
class ArrayTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			System.out.print("Enter new Element : ");
			arr[i] = scan.nextInt();
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}	
