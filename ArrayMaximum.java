import java.util.Scanner;
class ArrayMax
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[7];
		int a,sum=0;
		int max=arr[0];
		System.out.println("Element of array : ");
		for(a=0; a<7; a++)
		{
			arr[a]=scan.nextInt();
		}
		System.out.println("All elements : ");
		for(a=0; a<7; a++)
		{
			System.out.print(arr[a]+" ");
			sum=sum+arr[a];
		}
		System.out.println("Sum : "+sum);
		for(a=0; a<7; a++)
		{
			if(arr[a]>max)
			{
				max=arr[a];
			}
		}
		System.out.println("maximum : "+max);
	}
}


