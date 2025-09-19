import java.util.Scanner;
class FibonacciNumbers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int f=0,s=1,result,num;
        System.out.println("Write the Number :- ");
        num=scan.nextInt();
        {
            System.out.println("Fibonacci Numbers Result :- ");
            for(int i=0; i<num; i++)
            {
                result=f+s;
                System.out.println(result);
                f=s;
                s=result;
            }
        }
        scan.close();
    }
}