class AgeIsNotValidException extends Exception
{
	public AgeIsNotValidException()
	{
		
	}
	public AgeIsNotValidException(String msg)
	{
		super(msg);
	}
}
class Testage
{
	public void TestAge(int age) throws AgeIsNotValidException
	{
		if(age>=18 && age <=35)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new AgeIsNotValidException("Notttttttttt");
		}
	}
}
class CustomException
{
	public static void main(String[] args)
	{
		Testage t = new Testage();
		try
		{
			t.TestAge(12);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}