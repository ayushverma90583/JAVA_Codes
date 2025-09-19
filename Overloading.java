class Overloading1
{
    public void sum()
    {
        int Sum;
        int a=9;
        int b=6;
        Sum=a+b;
        System.out.println("Sum :- "+Sum);
    }
    public void sum(int a)
    {
        int Sum;
        int b=40;
        Sum=a+b;
        System.out.println("Sum :- "+Sum);
    }
    public void sum(int a , int b)
    {
        int Sum;
        Sum=a+b;
        System.out.println("Sum :- "+Sum);
    }
}
class Overloading
{
    public static void main(String[] args)
    {
        Overloading1 o = new Overloading1();
        o.sum();
    }
}