class VariableArguments2
{
    public static int average(int ...a)
    {
        int result = 0;
        int len = a.length;
        for(int i : a)
        {
            result = result + i;
        }
        result = result/len;
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Average of 2 Numbers :- "+average(5,7));
        System.out.println("Average of 3 Numbers :- "+average(5,6,7));
        System.out.println("Average of 4 Numbers :- "+average(5,6,2,7));
        System.out.println("Average of 5 Numbers :- "+average(5,7,5,11,12));
    }
}