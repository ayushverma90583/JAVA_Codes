import java.util.Scanner;
class Arraysum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		int a,sum=0;
		System.out.println("Enter Elements : ");
		for(a=0; a<5; a++)
		{
			arr[a]=scan.nextInt();
		}
		System.out.print("Elements : ");
		for(a=0; a<5; a++)
		{
			System.out.print(arr[a]+" ");
			sum=sum+arr[a];
		}
		System.out.println("Sum : "+sum);
	}
}