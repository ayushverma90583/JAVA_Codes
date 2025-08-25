import java.util.Scanner;
class LibraryException extends Exception
{
	public LibraryException()
	{
		
	}
	public LibraryException(String ex)
	{
		super(ex);
	}
}
class Library 
{
	public void Library() throws LibraryException
	{
		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println("Write the Number of Students :- ");
		s = scan.nextInt();
		if(s<80)
		{
			System.out.println("Seats are avalaible in the Library...");
		}
		else
		{
			throw new LibraryException("Seats are not avalaible in the Library...");
		}
	}	
}
class CustomException2
{
	public static void main(String[] args)
	{
		Library l = new Library();
		try
		{
			l.Library();
		}
		catch(Exception x)
		{
				System.out.println(x);
		}
	}

}
