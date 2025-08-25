import java.util.Scanner;
class Math
{
	private int getsum()
	{
		int a,b,s;
		a=40;
		b=30;
		s=a+b;
		return s;
	}
	
	public int setsum()
	{
		return getsum();
	}
	
}

class Maths extends Math
{
	public int show()
	{
		int res = setsum();
		System.out.println("res: "+res);
		return 0;
	}
	
}
class Inheritance4
{
	public static void main(String[] args)
	{
		Maths m = new Maths();
		m.show();
	}
}