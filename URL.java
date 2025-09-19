import java.util.Scanner;
class URL
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String url;
        System.out.print("Write the URL :- ");
        url=scan.next();
        if(url.endsWith(".com"))
        {
            System.out.println("This is Commercial Website");
        }
        else if(url.endsWith(".org"))
        {
            System.out.println("This is Organization Website");
        }
        else if(url.endsWith(".in"))
        {
            System.out.println("This is Indian Website");
        }
        else
        {
            System.out.println("THERE IS NO INFORMATION");
        }
        scan.close();
    }
}