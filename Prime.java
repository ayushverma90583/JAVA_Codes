class Prime
{
	public static void main(String[] args)
	{
		int num,a;
		num=5;
		for(a=2; a<num; a++)
		{
			if(num%a==0)
			{
				break;
			}
		}
		if(num==a)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}