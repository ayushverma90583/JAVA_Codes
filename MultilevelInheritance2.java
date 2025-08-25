class p
{
	public void perfect()
	{
		int a,sum=0,num;
		num=6;
		for(a=1; a<num; a++)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
		}
		System.out.println("Sum :- "+ sum);
		if(sum==num)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}	
}
class p2 extends p
{
	public void prime()
	{
		int a,num,prime=1;
		num=7;
		for(a=1; a<=num; a++)
		{
			if(num%a==0)
			{
				break;
			}
		}
		if(prime==1)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}
class c extends p2
{

}
class d extends c
{

}
class MultilevelInheritance2
{
	public static void main(String[] args)
	{
		d d1=new d();
		d1.prime();
		d1.perfect();
	}

}
