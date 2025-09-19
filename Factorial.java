class Factorial
{
    public static void main(String[] args)
    {
        int a,num;
        num=10;
        System.out.print("Factorials :- ");
        for(a=1; a<=num; a++)
        {   
            if(num%a==0)
            {
                System.out.print(" "+a);
            }
        }
    }
}