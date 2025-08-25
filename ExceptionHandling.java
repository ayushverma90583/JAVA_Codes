class ExceptionHandling
{
	public  static void main(String[] args)
	{
		int res,x, y;
		x = 12;
		y = 0;
		
		try
		{
			res = x/y;
			System.out.println("Result : "+res);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Program Ends here...");
	}
}