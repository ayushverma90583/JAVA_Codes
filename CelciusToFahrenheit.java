import java.util.Scanner;
class CelciusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float Celcius , Fahrenheit;
        System.out.println("Convert the Celcius To fahrenheit");
        System.out.print("Celcius :- ");
        Celcius=scan.nextFloat();

        // Convert Celcius to Fahrenheit by the formula of (Celcius * 9/5)+32

        Fahrenheit = (Celcius * 9/5)+32;
        System.out.println(Fahrenheit+" Degree Fahrenheit");
        System.out.println(Celcius+" degree celcius has "+Fahrenheit+" degree Fahrenheit...");
        scan.close();
    }
}