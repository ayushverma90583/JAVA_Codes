import java.util.Scanner;
class PassFail
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s=0,p,s1,s2,s3;
        System.out.println("Write the marks of 3 Subject :- ");
        s1=scan.nextInt();
        s2=scan.nextInt();
        s3=scan.nextInt();
        s=s1+s2+s3;
        System.out.println("Sum :- "+s);
        p=s/3;
        System.out.println("Percentage :- "+p+"%");
        if(p>=40 && s1>33 && s2>33 && s3>33)
        {
            System.out.println("The Student is \"PASS\"");
        }
        else
        {
            System.out.println("The Student is \"FAIL\"");
        }
        scan.close();
    }
}