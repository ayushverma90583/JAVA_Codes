import java.util.Scanner;
class ArrayMin
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[7];
		int a,sum=0;
		int min;
		System.out.println("Element of array : ");
		for(a=0; a<7; a++)
		{
			arr[a]=scan.nextInt();
		}
		min=arr[0];
		System.out.println("All elements : ");
		for(a=0; a<7; a++)
		{
			System.out.print(arr[a]+" ");
			sum=sum+arr[a];
		}
		System.out.println("Sum : "+sum);
		for(a=0; a<7; a++)
		{
			if(arr[a]<min)
			{
				min=arr[a];
			}
		}
		System.out.println("minimum : "+min);
	}
}


