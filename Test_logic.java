class Test_logic
{
    static int logic(int a , int b)
    {
        int c;
        if(a<b)
        {
            c=a+b;
        }
        else
        {
            c=(a+b)*2;
        }
        return c;
    }
    
    public static void main(String[] args)
    {
        int a1,b1,c1;
        a1=6;
        b1=5;
        c1=logic(a1,b1);
        System.out.println("Result :- "+c1);

    //    Test_logic l = new Test_logic();
    //    int a2,b2,c2;
    //    a2=3;
    //    b2=8;
    //    c2=l.logic(a2,b2);
    //    System.out.println("Result :- "+c2);
    }
}