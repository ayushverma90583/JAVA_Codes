import java.util.Scanner;
class TwoDArray
{
	public static void main(String[] args)
	{
		int arr[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Enter new Element : ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}