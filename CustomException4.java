import java.util.Scanner;
class Function extends Exception
{
    public void Function()
    {
    
    }
}   
class Table
{
    public void Table() throws Function
    {
        Scanner scan = new Scanner(System.in);
        int a,num;
        System.out.println("Write the Number :- ");
        num = scan.nextInt();
        if(num<=5)
        {    
            for(a=1; a<=10; a++)
            {
                System.out.println(num+"*"+a+"="+num*a);
            }
        }
        else
        {
            throw new Function();
        }
    }
}
class CustomException4
{
    public static void main(String[] args)
    {
        Table t = new Table();
        try
        {
            t.Table();
        }
        catch(Exception x)
        {
            System.out.println(x);
        }
    }
}