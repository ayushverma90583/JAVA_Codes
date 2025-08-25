class Testage
{
	public void Testimage(int age)
	{
		if(age>=18 && age <=35)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Persons less then 18 are not Eligible");
		}
	}
}
class Throw
{
	public static void main(String[] args)
	{
		Testage t = new Testage();
		try
		{
			t.Testimage(20);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}