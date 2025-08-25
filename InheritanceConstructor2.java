class Multiple
{
	public Multiple(int num)
	{
		int a;
		for(a=1; a<num; a++)
		{
			if(num%a==0)
			{
				System.out.println(a+" ");
			}
		}
	}
}
class Multi extends Multiple
{
	public Multi()
	{
		super(40);
	}
}
class InheritanceConstructor2
{
	public static void main(String[] args)
	{
		Multi m=new Multi();
	}
}