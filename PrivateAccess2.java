import java.util.Scanner;
class Function
{
	private Float getpercentage()
	{
		Scanner scan = new Scanner(System.in);
		float sum,hindi,english,maths,gk,science,total=500,per;
		hindi=67;
		english=59;
		maths=90;
		gk=89;
		science=90;
		sum=hindi+english+gk+science+maths;
		System.out.println("The Sum Of All Subjects :- "+sum);
		per=sum/total*100;
		return per;
	}
	public Float setpercentage()
	{
		return getpercentage();
	}
}
class Function2 extends Function
{
	public Float perc()
	{
		Float r = setpercentage();
		System.out.println("Result :- "+r);
		return (float)0;
	}
}
class PrivateAccess2
{
	public static void main(String[] args)
	{
		Function2 f = new Function2();
		f.perc();
	}

}
