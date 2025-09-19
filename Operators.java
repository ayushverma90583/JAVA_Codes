class Operators
{
    public static void main(String[] args)
    {
        //Relational Operators ( == , < , > , <= , >= , != )
        //Operator == ( Equals to )
        int a=20 , b=30;
        if(a==b)
        {
            System.out.println("A is equals to B");
        }
        else
        {
            System.out.println("A is not equals to B");
        }

        //Operator < ( More Than )
        int age=16;
        if(age>18)
        {
            System.out.println("Person is Eligible");
        }
        else
        {
            System.out.println("Person is not Eligible");
        }

        //Operator > ( Less Than )
        int number= -20;
        if(number<0)
        {
            System.out.println("Negitive Number");
        }
        else
        {
            System.out.println("Positive Number");
        }

        //Operator != ( Not Equals to )
        int c=18;
        if(c!=18)
        {
            System.out.println("Not equals to 18");
        }
        else
        {
            System.out.println("Equals to 18");
        }

        //Operator <= ( More Than equals to )
        int d=1;
        if(d>=1)
        {
            System.out.println("This Number is More than equals to 1");
        }

        //Operator >= ( Less Than equals to )
        int e=1;
        if(e<=1)
        {
            System.out.println("This number is Less than equals to 1");
        }

        //Logical Operators ( && , || , ! )
        //Operator && ( AND )
        int f=10 , g= -10;
        if(f > 0 && g < 0)
        {
            System.out.println("Condition is true");
        }
        else
        {
            System.out.println("Condition is not true");
        }

        //Operator || ( OR )
        int h=10 , i= -10;
        if(h > 0 || i > 0)
        {
            System.out.println("Condition is true");
        }
        else
        {
            System.out.println("Condition is not true");
        }

        //Operator ! ( NOT )
        boolean j=false;
        System.out.println(!j);
    }
}