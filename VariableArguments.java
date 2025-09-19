class VariableArguments
{
    static int sum(int ...a)
    {
        int result=0;
        for(int i : a)
        {
            result =result + i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of 0 Elements :- " + sum());
        System.out.println("Sum of 1 Elements :- " + sum(2));
        System.out.println("Sum of 2 Elements :- " + sum(5,45));
        System.out.println("Sum of 3 Elements :- " + sum(2,6,4));
        System.out.println("Sum of 4 Elements :- " + sum(1,4,7,10));
    }
}