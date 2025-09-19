import java.util.Scanner;
class ExceptionHandling 
{
    public static void main(String[] args)
    {
//Normal Exceptions (Illigal and Arithematic )
        //int a=25;
        //int b=0;

//Array Exception ( Array out of Bound )
        int [] number = new int[5];
        number[0]=59;
        number[1]=25;
        number[2]=54;
        number[3]=78;
        number[4]=19;
        Scanner scan = new Scanner(System.in);
        int index; 
        {
            try
            {
// First Case
                //int c = a/b;
                //System.out.println(c);

// Second Case array
                System.out.println("Enter the Index :- ");
                index = scan.nextInt();
                System.out.println("Result :- "+number[index]);
                scan.close();
            }
            catch(ArithmeticException x)
            {
                //System.out.println("HaHa");
                //System.out.println(x);
            }
            catch(IllegalArgumentException x)
            {
                //System.out.println("HeHe");
                System.out.println(x);
            }
            catch(ArrayIndexOutOfBoundsException x)
            {
                System.out.println("This Index is not exist in this array");
            }
        }
    }
}
