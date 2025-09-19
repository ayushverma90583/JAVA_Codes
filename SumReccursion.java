import java.util.Scanner;
class SumReccursion
{
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + sum(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write the number :- ");
        int n=scan.nextInt();
        int result = sum(n);
        System.out.println(result);
        scan.close();
    }
}