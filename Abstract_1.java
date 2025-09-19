import java.util.Scanner;
abstract class Function
{
	public abstract void Account();
}
class Function2 extends Function
{
	public void Account()
	{
		Scanner scan=new Scanner(System.in);
		String Accountuser;
		int currentbalance=10000;
		int withdrawl,balance;
		System.out.print("Write the Account User's name :- ");
		Accountuser = scan.next();
		System.out.print("Amount Withdrawl :- ");
		withdrawl = scan.nextInt();
		balance=currentbalance - withdrawl;
		System.out.println("Username :- "+Accountuser);
		System.out.print("After Withdrawing The Amount :- "+balance+" Rs Balance...");
	}
}
class Abstract_1
{
	public static void main(String[] args)
	{
		Function2 f = new Function2();
		f.Account();
	}

}
