import java.util.Scanner;
class Pattern
{
    public static void main(String[] args)
    {
        //Print Pattern in the Reverse Way...
        Scanner scan = new Scanner(System.in);
        int a,i,b,c;
        for(a=10; a>=1; a--)
        {
            for(i=1; i<=a; i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Print Pattern in the Normal Way...
        for(b=10; b>=1; b--)
        {
            for(c=10; c>=b; c--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scan.close();
    }
}