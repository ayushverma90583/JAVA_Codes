import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Write the Year :- ");
        year = scan.nextInt();
        if(year%4==0 && year%400==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Normal Year");
        }
        scan.close();
    }
}