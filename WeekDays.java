import java.util.Scanner;
class WeekDays
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.print("Write the option :- ");
        option=scan.nextInt();
        switch (option)
        {
            case 1 :
            System.out.println("SUNDAY");
            break;
            case 2 :
            System.out.println("MONDAY");
            break;
            case 3 :
            System.out.println("TUESDAY");
            break;
            case 4 :
            System.out.println("WEDNESDAY");
            break;
            case 5 :
            System.out.println("THURSDAY");
            break;
            case 6 :
            System.out.println("FRIDAY");
            break; 
            case 7 :
            System.out.println("SATURDAY");
            break;
        }
        scan.close();
    }
}