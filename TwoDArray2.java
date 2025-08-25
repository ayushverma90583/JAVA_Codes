import java.util.Scanner;
class TwoDArray2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[4][6];
		int a,i;
		System.out.println("Scan the Elements :- ");
		for(a=0; a<4; a++)
		{
			for(i=0; i<6; i++)
			{
				arr[a][i]=scan.nextInt();
			}
		}
		for(a=0; a<4; a++)
		{
			for(i=0; i<6; i++)
			{
				System.out.print(arr[a][i]+" ");
			}
			System.out.println();
		}
	}
}