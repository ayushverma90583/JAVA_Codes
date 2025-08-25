import java.util.Scanner;
class SumTwoDArray
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int a,i;
		int sum=0,sumcolumn=0,sumrow=0;
		int d1=0;
		System.out.println("Enter Elements : ");
		for(a=0; a<3; a++)
		{
			for(i=0; i<3; i++)
			{
				arr[a][i]=scan.nextInt();
				if(a==i)
				{
					d1 = d1 + arr[a][i];
				}
			}
		}
		for(a=0; a<3; a++)
		{
			for(i=0; i<3; i++)
			{
				System.out.print(arr[a][i]+" ");
				sum=sum+arr[a][i];
			}
			System.out.println();
		}
		for(a=0; a<3; a++)
		{
			sumcolumn=sumcolumn+arr[a][0];
		}
		for(i=0; i<3; i++)
		{
			sumrow=sumrow+arr[0][i];
		}
		System.out.println("Sum of all Elements : "+sum);
		System.out.println("Sum of column : "+sumcolumn);
		System.out.println("Sum of row : "+sumrow);
		System.out.println("Sum of Left Diagonal : "+d1);
	}
}