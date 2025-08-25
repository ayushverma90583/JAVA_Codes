class Numbers
{
	public void Prime()
	{
		int num,a,prime=1;
		num=11;
		for(a=2; a<num; a++)
		{
			if(num%a==0)
			{
				prime=0;
			}
		}
		if(prime==1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
	public void sum()
	{
		int a,b,r;
		a=20;
		b=2;
		r=a+b;
		System.out.println("Result :- "+r);
	}
}
class Number extends Numbers
{
	public void Prime()
	{
		int num,a,prime=1;
		num=6;
		for(a=2; a<num; a++)
		{
			if(num%a==0)
			{
				prime=0;
			}
		}
		if(prime==1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
class Upcasting2
{
	public static void main(String[] args)
	{
		Numbers n = new Number();
		n.Prime();
		n.sum();
	}
}