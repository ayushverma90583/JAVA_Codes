import java.util.Scanner;
class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int amount;
        int tax=0;
        System.out.print("Write the Amount :- ");
        amount=scan.nextInt();
        //if amount is less than 2.5 lakhs then tax is 0%
        if(amount<=250000)
        {
            tax=0;
        }
        //if amount is more than 2.5 lakhs and less then 5 lakhs then
        //" First "tax is taken 5 % on the extra amount after 2.5 lakhs and less then 5 lakhs
        else if(amount>250000 && amount<=500000)
        {
            tax=5*(amount-250000)/100;
        }
        //if amount is more than 5 lakhs and less then 10 lakhs then 
        //" First " taken 5 % on the extra amount after 2.5 lakhs and less then 5 lakhs
        //"Secondly" tax is taken 10 % on the extra amount after 5 lakhs and less then 10 lakhs
        else if(amount>500000 && amount<=1000000)
        {
            tax=5*(500000-250000)/100+10*(amount-500000)/100;
        }
        //if amount is more than 10 lakhs then 
        //" First " taken 5 % on the extra amount after 2.5 lakhs and less then 5 lakhs
        //" Secondly " tax is taken 10 % on the extra amount after 5 lakhs and less then 10 lakhs
        //" Third " tax is taken 20% after the amount of 10 lakhs 
        else if(amount>1000000)
        {
            tax=5*(500000-250000)/100+10*(1000000-500000)/100+20*(amount-1000000)/100;
        }
        else
        {
            System.out.println("There is no information");
        }
        System.out.println("TAX paid by an Employee :- "+tax);
        scan.close();
    }
}